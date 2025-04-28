package de.fhswf.arinir;

/* Programmname: Kundenverwaltung mit Datenhaltung
 * Container-Klasse: KundenContainer
 * Aufgabe: Verwaltung von Objekten der Klasse Kunde
 * Datenhaltung: Indizierte Organisation mit physisch sortiertem Index
 * Muster: Singleton
 * Iterator: Interface Iterator
 * Annahmen: Der Aufrufer muss selbst prüfen, ob ein übergebenes Objekt
 * vom Typ Kunde null ist oder nicht
 */

import java.io.*;
import java.util.*;

class KundenContainer implements Iterator
{
    //Attribute für den Iterator
    private int aktuelleNr = 0;
    private final int NR_MAX = 10;
    //Attribute für die Datenhaltung
    private Index derIndex;
    private Datei dieDatei;
    //Klassen-Attribut
    private static KundenContainer einKundenContainer = null;
    //Speichert Referenz auf das einzige Objekt

    //Konstruktor, von außen nicht zugreifbar
    private KundenContainer()
    {
        oeffneDateien();
    }

    //Klassen-Operation, die die Objektreferenz liefert
    //Wenn Objekt noch nicht vorhanden, dann wird es erzeugt
    public static KundenContainer getObjektreferenz()
    {
        if (einKundenContainer == null)
            einKundenContainer = new KundenContainer();
        //Konstruktor, kann nur einmal aufgerufen werden
        return einKundenContainer;
    }

    //-----------------------------------------------
    //öffentliche Methoden
    public void einfuegeKunde(Kunde einKunde, int kdnnr)
    {
        //Aufbau eines Datensatzes als Zeichenkette
        //Die einzelnen Teile sind durch Tab getrennt
        //kdnnr = kundennummer
        String datensatz = Integer.toString(kdnnr) + "\t"
                + einKunde.getName() + "\t"
                + einKunde.getTelefon() + "\t"
                + Integer.toString(einKunde.getBlz()) + "\t"
                + Integer.toString(einKunde.getKontonr());

        int index = derIndex.gibIndexZuSchluessel(kdnnr);
        System.out.println("einfuege Kunde: Index = " + index);
        if (index != -1)
        {
            System.out.println("Datensatz schon vorhanden: " + kdnnr + " " + index);
            //überschreibt den vorhandenen Datensatz in der Hauptdatei
            try
            {
                dieDatei.speichereSatz(datensatz, index);
            }
            catch (IOException e)
            {
                System.out.println("Fehler bei speichereSatz: " + e);
            }
        }
        else //Datenatz ist neu, hinten anhängen
        {
            //Anzahl Datensätze in Datei ermitteln,
            //daraus neuen Index ermitteln
            index = dieDatei.gibAnzahlDatensaetze();
            System.out.println("schreibeDatensatz: AnzahlDatensätze = Index: " + index);
            //Schreibt den Index in die Indexdatei
            //Die nr ist der Schlüssel
            try
            {
                derIndex.erzeugeEintrag(kdnnr, index);
            }
            catch (IOException e)
            {
                System.out.println("Fehler bei erzeugeEintrag: " + e);
            }
            //Speichert einen Datensatz in der Hauptdatei
            try
            {
                dieDatei.speichereSatz(datensatz, index);
            }
            catch (IOException e)
            {
                System.out.println("Fehler bei speichereSatz: " + e);
            }
        }
    }

    //-----------------------------------------------
    public Kunde gibKunde(int kdnnr)
    {
        String einKundensatz = "";
        einKundensatz = leseDatensatz(kdnnr);
        Scanner einScanner = new Scanner(einKundensatz).useDelimiter("\\t");
        String nr = einScanner.next();
        //identisch mit Kundennr, daher überlesen
        String name = einScanner.next();
        String telefon = einScanner.next();
        String blz = einScanner.next();
        Integer blzInt = new Integer(blz);
        String kontonr = einScanner.next();
        Integer kontonrInt = new Integer(kontonr);
        //Neues Objekt mit den gespeicherten Daten erzeugen
        return new Kunde(kdnnr, name, telefon, blzInt.intValue(), kontonrInt.intValue());
    }

    //-----------------------------------------------
    public void endeAnwendung()
    {
        schliesseDateien();
    }

    //Implementierung der Schnittstelle Iterator
    public boolean hasNext()
    {
        //Prüfen, ob in der Indexdatei noch Datensatz-Indizes
        //gespeichert sind
        //Lücken sind möglich; gekennzeichnet durch Index = -1
        aktuelleNr++;
        while (aktuelleNr < NR_MAX)
        {
            if (derIndex.gibIndexZuSchluessel(aktuelleNr) != -1)
                return true;
            else
                aktuelleNr++;
        }
        aktuelleNr = 0;
        return false;
    }

    public Object next()
    {
        //Voraussetzung: es wurde mit hasNext geprüft,
        //dass noch ein Element da ist
        return gibKunde(aktuelleNr);
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    //Private Methoden für die Datenhaltung
    //Nehmen die Methoden der Klassen Datei und Index in Anspruch
    private void oeffneDateien()
    {
        //Deklarieren und Initialisieren der Indextabelle
        derIndex = new Index();
        try
        {
            //Indexdatei öffnen und Indextabelle laden
            derIndex.ladeIndexDatei();
        }
        catch (IOException e)
        {
            try //Wenn nicht vorhanden, dann neu anlegen
            {
                derIndex.speichereIndexDatei();
            }
            catch (IOException e1)
            {
                System.out.println("Fehler beim Anlegen der Indexdatei");
            }
            System.out.println("Indexdatei nicht vorhanden, wird neu angelegt");
        }
        //Hauptdatei öffnen
        dieDatei = new Datei();
    }

    //-----------------------------------------------
    private void schliesseDateien()
    {
        if (derIndex != null)
        {
            try
            {
                //Indexdatei speichern
                derIndex.speichereIndexDatei();
            }
            catch (IOException e)
            {
                System.out.println("Probleme beim Schließen der Indexdatei " + e);
            }
            //Schließen der Hauptdatei
            if (dieDatei != null)
                dieDatei.schliesseDatei();
        }
    }

    //-----------------------------------------------
    private String leseDatensatz(int kdnnr)
    {
        String datensatz = "";
        int index = derIndex.gibIndexZuSchluessel(kdnnr);
        if (index != -1)//Ein Datensatz-Index ist vorhanden
        {
            try
            {
                datensatz = dieDatei.leseSatz(index);
            }
            catch (IOException e)
            {
                System.out.println("leseDatensatz: Kein Datensatz vorhanden: Index = "
                        + index);
            }
            return datensatz;
        } else
            return null;
    }

    //Zum Testen
    public void gibIndexAus()
    {
        derIndex.gibIndextabelleAus();
    }

    //Zum Testen
    public void gibKundenAus()
    {
        dieDatei.gibDatensaetzeAus();
    }
}
