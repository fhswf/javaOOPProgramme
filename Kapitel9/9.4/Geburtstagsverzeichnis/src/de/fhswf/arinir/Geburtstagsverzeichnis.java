package de.fhswf.arinir;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

import de.fhswf.arinir.inout.Console;

public class Geburtstagsverzeichnis
{
    public static void main(String[] args)
    {
        Map<String, LocalDate> gebver = new HashMap<>();

        gebver.put("Sabine", LocalDate.of(1994, 12, 23));
        gebver.put("Heiko", LocalDate.of(1977, 07, 11));
        gebver.put("Irma", LocalDate.of(1985, 01, 01));
        gebver.put("Stefan", LocalDate.of(1976, 04, 30));

        String vorname = Console.readString();
        System.out.println(vorname + " hat Geburtstag am: " + gebver.get(vorname));
    }
}