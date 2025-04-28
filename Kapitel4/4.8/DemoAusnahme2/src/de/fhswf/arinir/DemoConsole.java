package de.fhswf.arinir;

import java.util.*;

public class DemoConsole
{
    public static void main(String args[])
    {
        int i = 0;
        for (; ; )
        {
            System.out.println("Bitte ganze Zahl > 0 eingeben: ");
            //Aufruf mit Überprüfung auf Ausnahmeauslösung
            try
            {
                i = Console.readPositiveInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Es muss eine ganze Zahl > 0 eingegeben werden!");
                continue;
            }
            catch (Exception e)
            {
                System.out.println("Fehlerhafte Eingabe: " + e.getMessage());
                continue;
            }
        }
        System.out.println("Gelesener Wert: " + i);
    }
}