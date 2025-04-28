package de.fhswf.arinir;

/* Programmname: Kundenverwaltung
 * UI-Klasse: KundeUI
 * Aufgabe: Klasse zur Erfassung von Kundendaten
 * und zur Ausgabe von Kundendaten
 * Es ist jeweils die Kundennummer anzugeben (>0 und < 1000)
 */

import de.fhswf.arinir.inout.Console;

class KundenverwaltungUI
{
    private static void druckeKunde(Kunde einKunde)
    {
        System.out.println("Kundennr: " + einKunde.getNummer());
        System.out.println("Name: " + einKunde.getName());
        System.out.println("Telefon: " + einKunde.getTelefon());
        System.out.println("BLZ: " + einKunde.getBlz());
        System.out.println("Kontonr: " + einKunde.getKontonr());
    }

    //-----------------------------------------------
    public static void main(String args[])
    {
        KundenContainer meinContainer = KundenContainer.getObjektreferenz();
        char auswahl;
        for (; ; )
        {
            System.out.println("Bitte Funktion auswählen:");
            System.out.println("1: Neuen Kunden eintragen");
            System.out.println("2: Kundendaten lesen");
            System.out.println("3: Aktuelle Indextabelle ausgeben");
            System.out.println("4: Alle Kundendaten ausgeben");
            System.out.println("9: Abbruch");
            System.out.println("Bitte Ziffer 1, 2, 3, 4 oder 9 eingeben:");
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

                    Kunde einKunde = new Kunde(kundennr, name, telefon, blz, kontonr);
                    meinContainer.einfuegeKunde(einKunde, kundennr);
                    break;
                }
                case '2':
                {
                    System.out.println("Kundennr:");
                    int kundennr = Console.readInt();
                    Kunde einKunde = meinContainer.gibKunde(kundennr);
                    druckeKunde(einKunde);
                    break;
                }
                case '3':
                    meinContainer.gibIndexAus();
                    break;
                case '4':
                {
                    meinContainer.gibKundenAus();
                    //Alle Objekte ausgeben
                    while (meinContainer.hasNext())
                    {
                        Kunde einKunde = (Kunde) meinContainer.next();
                        if (einKunde != null)
                            druckeKunde((Kunde) einKunde);
                    }
                    break;
                }
                default:
                    System.out.println("Fehlerhafte Eingabe: " +
                            "Bitte nur 1, 2, 3, 4 oder 9 eingeben");
                    continue;
            }
        }
        meinContainer.endeAnwendung();
        System.out.println("Ende des Programms");
    }
}
