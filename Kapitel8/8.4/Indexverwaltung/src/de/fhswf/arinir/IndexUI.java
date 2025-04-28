package de.fhswf.arinir;

import java.io.*;

import de.fhswf.arinir.inout.Console;

public class IndexUI
{
    private static Index derIndex;
    private static Datei dieDatei;

    //Methoden
    //-----------------------------------------------
    private static void oeffneDateien()
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
    private static void schliesseDateien()
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
    private static void schreibeDatensatz
    (String datensatz, int schluessel)
    {
        int index = derIndex.gibIndexZuSchluessel(schluessel);
        if (index != -1)
        {
            System.out.println("Datensatz schon vorhanden: " + schluessel + " "
                            + index);
            //überschreibt den vorhandenen Datensatz in der
            //Hauptdatei
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
                derIndex.erzeugeEintrag(schluessel, index);
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
    private static String leseDatensatz(int schluessel)
    {
        String datensatz = "";
        int index = derIndex.gibIndexZuSchluessel(schluessel);
        if (index != -1)//Ein Datensatz-Index ist vorhanden
        {
            try
            {
                datensatz = dieDatei.leseSatz(index);
            }
            catch (IOException e)
            {
                System.out.println("leseDatensatz: Kein Datensatz da: Index = " + index);
            }
            return datensatz;
        } else
            return null;
    }

    //-----------------------------------------------
    public static void main(String args[])
    {
        oeffneDateien();
        char auswahl;
        for (; ; )
        {
            System.out.println("Bitte Funktion auswählen:");
            System.out.println("1: Neuen Datensatz eintragen");
            System.out.println("2: Datensatz lesen");
            System.out.println("3: Aktuelle Indextabelle ausgeben");
            System.out.println("4: Aktuelle Datensätze ausgeben");
            System.out.println("9: Abbruch");
            System.out.println("Bitte Ziffer 1, 2, 3, 4 oder 9 eingeben:");
            auswahl = Console.readChar();
            if (auswahl == '9') break;

            switch (auswahl)
            {
                case '1':
                {
                    System.out.println("Datensatz:");
                    String einDatensatz = Console.readString();
                    System.out.println("Schlüssel:");
                    int einSchluessel = Console.readInt();
                    schreibeDatensatz(einDatensatz, einSchluessel);
                    break;
                }
                case '2':
                {
                    System.out.println("Schlüssel:");
                    int einSchluessel = Console.readInt();
                    System.out.println("Datensatz: " + leseDatensatz(einSchluessel));
                    break;
                }
                case '3':
                    derIndex.gibIndextabelleAus();
                    break;
                case '4':
                    dieDatei.gibDatensaetzeAus();
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe: " +
                            "Bitte nur 1, 2, 3, 4 oder 9 eingeben");
                    continue;
            }
        }
        schliesseDateien();
        System.out.println("Ende des Programms");
    }
}
