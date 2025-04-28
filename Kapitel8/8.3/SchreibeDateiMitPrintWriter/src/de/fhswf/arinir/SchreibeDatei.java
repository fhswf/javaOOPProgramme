package de.fhswf.arinir;

import java.io.*;

class SchreibeDatei
{
    public static void main(String args[])
    {
        try (PrintWriter eineAusgabeDatei = new PrintWriter("MesswerteDatei.txt"))
        {
            eineAusgabeDatei.println(200.32);
            eineAusgabeDatei.println(55.43);
        }
        catch (FileNotFoundException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}