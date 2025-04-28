package de.fhswf.arinir;

public class DemoConsole
{
    public static void main(String args[])
    {
        int i;
        for (; ; )
        {
            System.out.println("Bitte ganze Zahl > 0 eingeben: ");
            i = Console.readPositiveInt();
            if (i != -1) break;
        }
        System.out.println("Gelesener Wert: " + i);
    }
}