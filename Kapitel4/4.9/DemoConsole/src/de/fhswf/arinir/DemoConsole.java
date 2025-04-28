package de.fhswf.arinir;

import de.fhswf.arinir.inout.*;

public class DemoConsole
{
    public static void main(String args[])
    {
        System.out.println("Text eingeben: ");
        String text = Console.readString();
        System.out.println("Gelesener Text: " + text);
        System.out.println("Text eingeben: ");
        char[] ca = Console.readCharArray();
        System.out.println("Gelesenes char-Feld: ");
        for (char celement : ca)
            System.out.print(celement);
        System.out.println();

        System.out.println("Boolean eingeben: ");
        boolean b = Console.readBoolean();
        System.out.println("Gelesener Wert: " + b);

        System.out.println("Ganze Zahl eingeben: ");
        int i = Console.readInt();
        System.out.println("Gelesene Zahl: " + i);

        System.out.println("Zeichen eingeben: ");
        char c = Console.readChar();
        System.out.println("Gelesenes Zeichen: " + c);

        System.out.println("Fließkommazahl eingeben (float): ");
        float f = Console.readFloat();
        System.out.println("Gelesene Fließkommazahl: " + f);

        System.out.println("Fließkommazahl eingeben (double): ");
        double d = Console.readDouble();
        System.out.println("Gelesene Fließkommazahl: " + d);

        System.out.println("Lange Ganzzahl eingeben: ");
        long l = Console.readLong();
        System.out.println("Gelesene lange Zahl: " + l);
    }
}