package de.fhswf.arinir;

/* Programmname: Insrentenverwaltung
 * UI-Klasse: InserentenverwaltungUI
 * Aufgabe: Klassen zur Verwaltung von Inserenten
 * und ihren Anzeigen
 */

import de.fhswf.arinir.inout.Console;

import java.util.*;

class InserentenverwaltungUI
{
    private static void druckeKunde(Kunde einKunde)
    {
        System.out.println("Kundennr: " + einKunde.getKundennr());
        System.out.println("Name: " + einKunde.getName());
        System.out.println("Telefon: " + einKunde.getTelefon());
        System.out.println("BLZ: " + einKunde.getBlz());
        System.out.println("Kontonr: " + einKunde.getKontonr());
    }

    private static void druckeAnzeige(Anzeige eineAnzeige)
    {
        System.out.println("Anzeigennr: " + eineAnzeige.getAnzeigennr());
        System.out.println("Titel: " + eineAnzeige.getTitel());
        System.out.println("Inserent: " + eineAnzeige.getLinkKunde().getName());
    }

    //-----------------------------------------------
    public static void main(String args[]) throws Exception
    {
        ObjektContainer meinContainer = ObjektContainer.getObjektreferenz();
        Kunde einKunde;
        Anzeige eineAnzeige;
        char auswahl;
        for (; ; )
        {
            System.out.println("Bitte Funktion auswählen:");
            System.out.println("1: Neuen Kunden/Anzeige eintragen");
            System.out.println("2: Kundendaten & assoziierte Anzeigen lesen");
            System.out.println("3: Alle Kunden & Anzeigen ausgeben");

            System.out.println("9: Abbruch");
            System.out.println("Bitte Ziffer 1, 2, 3 oder 9 eingeben:");
            auswahl = Console.readChar();
            if (auswahl == '9') break;

            switch (auswahl)
            {
                case '1':
                {
                    System.out.println("Kundendaten eingeben:");
                    System.out.println("Kundennr:");

                    int kundennr = Console.readInt();
                    System.out.println("Name:");

                    String name = Console.readString();
                    System.out.println("Telefon:");

                    String telefon = Console.readString();
                    System.out.println("BLZ:");

                    int blz = Console.readInt();
                    System.out.println("Kontonr:");

                    int kontonr = Console.readInt();

                    einKunde = new Kunde(kundennr, name, telefon, blz, kontonr);

                    System.out.println("Anzeigendaten eingeben:");
                    System.out.println("Anzeigennr:");

                    int anzeigennr = Console.readInt();
                    System.out.println("titel:");

                    String titel = Console.readString();

                    eineAnzeige = new Anzeige(anzeigennr, titel);

                    System.out.println("Anzeige wird dem Kunden zugeordnet");

                    einKunde.setLinkAnzeige(eineAnzeige);
                    eineAnzeige.setLinkKunde(einKunde);

                    //Speichern der Objekte im Container
                    meinContainer.einfuegeKunde(einKunde);
                    meinContainer.einfuegeAnzeige(eineAnzeige);
                    break;
                }
                case '2':
                {
                    System.out.println("Kundennr:");
                    int kundennr = Console.readInt();
                    einKunde = meinContainer.gibKunde(kundennr);
                    if (einKunde != null)
                        druckeKunde(einKunde);
                    ArrayList<Anzeige> anzeigen = einKunde.alleAnzeigen();
                    for (Object o : anzeigen)
                    {
                        eineAnzeige = (Anzeige) o;
                        System.out.println(eineAnzeige.getAnzeigennr() + " " + eineAnzeige.getTitel());
                    }
                    break;
                }
                case '3':
                {
                    Iterator e = meinContainer.iteratorKunden();
                    System.out.println("Alle Kunden:");
                    while (e.hasNext())
                    {
                        //Da next() ein Objekt der Klasse Object zurückliefert,
                        //muss dieses Objekt in Klasse Kunde gewandelt werden (casting)
                        einKunde = (Kunde) e.next();
                        if (einKunde != null)
                            druckeKunde(einKunde);
                    }
                    e = meinContainer.iteratorAnzeigen();
                    System.out.println("Alle Anzeigen:");
                    while (e.hasNext())
                    {
                        //Da next() ein Objekt der Klasse Object zurückliefert,
                        //muss dieses Objekt in Klasse Kunde gewandelt werden (casting)
                        eineAnzeige = (Anzeige) e.next();
                        if (eineAnzeige != null)
                            druckeAnzeige(eineAnzeige);
                    }
                    break;
                }
                default:
                    System.out.println("Fehlerhafte Eingabe: " +
                            "Bitte nur 1, 2, 3 oder 9 eingeben");
                    continue;
            }
        }
        meinContainer.endeAnwendung();
        System.out.println("Ende des Programms");
    }
}