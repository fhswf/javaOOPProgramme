package de.fhswf.arinir;

import java.util.*;

public class DemoScanner2
{
    public static void main(String args[])
    {
        //Objekt erzeugen, das von der Konsole liest
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Vornamen und Nachnamen eingeben: ");
        //gesamte Zeile von der Konsole lesen
        String text = sc.nextLine();
        System.out.println("Text: " + text);
    }
}