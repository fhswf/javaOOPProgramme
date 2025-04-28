package de.fhswf.arinir;

import de.fhswf.arinir.inout.Console;

import java.time.LocalDate;

public class DemoLocalDate
{
    public static void main(String args[])
    {
        LocalDate aktuellesDatum = null;
        LocalDate fertigDatum = null;
        LocalDate geburtsDatum = null;

        //23.12.2013 soll gesetzt werden
        fertigDatum = LocalDate.of(2013, 12, 23);

        //Fertigstellungsdatum ausgeben
        System.out.println("Fertigstellungs-Datum: " + fertigDatum);

        //Aktuelles Datum soll gesetzt werden
        aktuellesDatum = LocalDate.now();
        System.out.println("Aktuelles Datum: " + aktuellesDatum);

        //Einlesen eines Datums
        System.out.println("Ihr Geburtsdatum: jjjj-mm-tt:");
        String datumStr = Console.readString();

        //Eingelesenes Datum umwandeln
        geburtsDatum = LocalDate.parse(datumStr);

        //Eingelesenes Datum ausgeben
        System.out.println("Ihr Geburtsdatum: " + geburtsDatum);

        //Plausibilitaet pruefen
        if (aktuellesDatum.isBefore(geburtsDatum))
        {
            System.out.println("Sie sind noch nicht geboren!");
        }
        else
        {
            System.out.println("Ihr Alter: " + geburtsDatum.until(aktuellesDatum).getYears());
        }
    }
}
