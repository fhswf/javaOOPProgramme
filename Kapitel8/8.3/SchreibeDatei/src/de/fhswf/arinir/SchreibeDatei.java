package de.fhswf.arinir;

//Schreibt einen Text in eine Textdatei

import java.io.*;

class SchreibeDatei
{
    public static void main(String args[])
    {
        try (FileWriter eineAusgabeDatei = new FileWriter("Schreibedatei.txt"))
        {
            eineAusgabeDatei.write("Erste Zeile Text\n");
            eineAusgabeDatei.write("Zweite Zeile Text\n");
        }
        catch (IOException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}