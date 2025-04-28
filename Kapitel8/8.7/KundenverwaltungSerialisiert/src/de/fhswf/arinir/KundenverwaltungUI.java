package de.fhswf.arinir;

import java.util.*;
import de.fhswf.arinir.inout.Console;

public class KundenverwaltungUI
{
    private static void druckeKunde(Kunde einKunde)
    {
        System.out.println("Kundennr: " + einKunde.getKundennr());
        System.out.println("Name: " + einKunde.getName());
        System.out.println("Telefon: " + einKunde.getTelefon());
        System.out.println("BLZ: " + einKunde.getBlz());
        System.out.println("Kontonr: " + einKunde.getKontonr());
    }

    //-----------------------------------------------
    public static void main (String args[])
    {
        KundenContainer meinContainer =
                KundenContainer.getObjektreferenz();
        Kunde einKunde;
        char auswahl;
        for(;;)
        {
            System.out.println("Bitte Funktion auswählen:");
            System.out.println("1: Neuen Kunden eintragen");
            System.out.println("2: Kundendaten lesen");
            System.out.println("3: Alle Kundendaten ausgeben");
            System.out.println("9: Abbruch");
            System.out.println("Bitte Ziffer 1, 2, 3, 4 oder 9 eingeben:");
            auswahl = Console.readChar();
            if (auswahl =='9') break;

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

                    einKunde = new Kunde(kundennr,name,telefon,blz,kontonr);
                    meinContainer.einfuegeKunde(einKunde);
                    break;
                }
                case '2':
                {
                    System.out.println("Kundennr:");
                    int kundennr = Console.readInt();
                    einKunde = meinContainer.gibKunde(kundennr);
                    if (einKunde != null)
                        druckeKunde(einKunde);
                    break;
                }
                case '3':
                {
                    Iterator e = meinContainer.iterator();
                    while (e.hasNext())
                    {
                        //Da next() ein Objekt der Klasse Object zurückliefert,
                        //muss dieses Objekt in Klasse Kunde gewandelt werden (casting)
                        einKunde = (Kunde)e.next();
                        if (einKunde != null)
                            druckeKunde(einKunde);
                    }
                    break;
                }
                default: System.out.println("Fehlerhafte Eingabe: " +
                        "Bitte nur 1, 2, 3 oder 9 eingeben");
                    continue;
            }
        }
        meinContainer.endeAnwendung();
        System.out.println("Ende des Programms");
    }
}
