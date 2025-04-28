package de.fhswf.arinir;

//Liest einen Text aus einer Textdatei gepuffert

import java.io.*;

class LeseDatei
{
    public static void main(String args[])
    {
        double summe = 0.0;
        try (FileReader eineEingabeDatei = new FileReader("Messwertedatei.txt");
             BufferedReader eingabeDaten = new BufferedReader(eineEingabeDatei))
        {
            String zeile = eingabeDaten.readLine();
            while (zeile != null)
            {
                summe = summe + Double.parseDouble(zeile);
                System.out.println(zeile);
                zeile = eingabeDaten.readLine();
            }
            System.out.println("Summe: " + summe);
        }
        catch (IOException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}