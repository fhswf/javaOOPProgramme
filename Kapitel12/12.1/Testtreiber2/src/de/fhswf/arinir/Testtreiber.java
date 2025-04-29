package de.fhswf.arinir;

import de.fhswf.arinir.inout.Console;

public class Testtreiber
{
    static boolean jaAnw = false;
    static boolean neinAnw = false;

    //Instrumentierter Testling
    static int bestimmeMax(int a, int b)
    {
        if (a > b)
        {
            jaAnw = true;
            return a;
        }
        else
        {
            neinAnw = true;
            return b;
        }
    }

    public static void main(String args[])
    {
        for (; ; )
        {
            System.out.print("Wert für a: ");
            int a = Console.readInt();
            System.out.print("Wert für b: ");
            int b = Console.readInt();
            //Aufruf des Testlings
            System.out.println("Max: " + bestimmeMax(a, b));
            System.out.println("Durchlauf JaAnweisung: " + jaAnw);
            System.out.println("Durchlauf NeinAnweisung: " + neinAnw);
            System.out.print("Weiter: J/N ");
            if (Console.readChar() == 'N')
                break;
        }
    }
}