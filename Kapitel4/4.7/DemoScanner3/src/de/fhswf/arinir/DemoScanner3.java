package de.fhswf.arinir;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DemoScanner3
{
    public static void main(String args[])
    {
        //Objekt erzeugen, das von der Konsole liest
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Vornamen und Nachnamen eingeben: ");
        //Text bis zum Leerzeichen von der Konsole lesen
        try
        {
            String text = sc.next("\\D+");
            System.out.println("Vorname: " + text);
            //nächsten Text bis zum Leerzeichen oder
            //Zeilenende lesen
            text = sc.next("\\D+");
            System.out.println("Nachname: " + text);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Ziffern in Namen sind nicht erlaubt");
        }
    }
}