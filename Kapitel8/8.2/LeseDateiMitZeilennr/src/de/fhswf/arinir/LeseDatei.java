package de.fhswf.arinir;

//Liest einen Text aus einer Textdatei gepuffert

import java.io.*;

class LeseDatei
{
    public static void main(String args[])
    {
        try (FileReader eineEingabeDatei = new FileReader("Messwertedatei.txt");
             LineNumberReader eingabeDaten = new LineNumberReader(eineEingabeDatei))
        {
            String zeile = eingabeDaten.readLine();
            while (zeile != null)
            {
                System.out.println(eingabeDaten.getLineNumber() + ": " + zeile);
                zeile = eingabeDaten.readLine();
            }
        }
        catch (IOException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}