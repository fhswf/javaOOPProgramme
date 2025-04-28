package de.fhswf.arinir;

import de.fhswf.arinir.inout.Console;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DemoLocalDate2
{

    public static void main(String args[])
    {
        LocalDate aktuellesDatum = null;
        LocalDate fertigDatum = null;
        LocalDate geburtsDatum = null;

        //Ausgabeformat setzen: Montag, 23. Dezember 2013
        DateTimeFormatter meinAusgabeFormat = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy", Locale.GERMAN);

        //23.12.2013 soll gesetzt werden
        fertigDatum = LocalDate.of(2013, 12, 23);

        //Fertigstellungsdatum ausgeben
        System.out.println("Fertigstellungs-Datum: " + fertigDatum.format(meinAusgabeFormat));

        //Aktuelles Datum soll gesetzt werden
        aktuellesDatum = LocalDate.now();
        System.out.println("Aktuelles Datum: " + aktuellesDatum.format(meinAusgabeFormat));

        //Einlesen eines Datums
        System.out.println("Ihr Geburtsdatum: tt.mm.jjjj:");
        String datumStr = Console.readString();

        //Eingabeformat setzen: 23.12.2013
        DateTimeFormatter meinEingabeFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);

        //Eingelesenes Datum speichern
        geburtsDatum = LocalDate.parse(datumStr, meinEingabeFormat);

        //Eingelesenes Datum ausgeben
        System.out.println("Ihr Geburtsdatum: " + geburtsDatum.format(meinAusgabeFormat));

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