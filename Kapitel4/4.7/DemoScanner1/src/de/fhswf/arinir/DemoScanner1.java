package de.fhswf.arinir;

import java.util.*;

public class DemoScanner1
{
    public static void main(String args[])
    {
        //Objekt erzeugen, das von der Konsole liest
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Vornamen und Nachnamen eingeben: ");
        //Text bis zum Leerzeichen von der Konsole lesen
        String text = sc.next();
        System.out.println("Vorname: " + text);
        //nächsten Text bis zum Leerzeichen oder
        //Zeilenende lesen
        text = sc.next();
        System.out.println("Nachname: " + text);
    }
}