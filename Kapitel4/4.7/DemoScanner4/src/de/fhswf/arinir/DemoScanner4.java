package de.fhswf.arinir;

import java.util.*;

public class DemoScanner4
{
    public static void main(String args[])
    {
        //Objekt erzeugen, das von der Konsole liest
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Ganze Zahl eingeben: ");
        int i = sc.nextInt();
        System.out.println("Gelesene Zahl: " + i);

        System.out.println("Zahl mit Nachkommastellen: ");
        float f = sc.nextFloat();
        System.out.println("Gelesene Zahl: " + f);
    }
}