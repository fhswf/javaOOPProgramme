package de.fhswf.arinir;

//Liest einen Text aus einer Textdatei gepuffert

import java.io.*;

class LeseDatei
{
    public static void main(String args[])
    {
        try (FileReader eineEingabeDatei = new FileReader("src/de/fhswf/arinir/LeseDatei.java");
             BufferedReader eingabeDaten = new BufferedReader(eineEingabeDatei))
        {
            //Erste Zeile lesen
            String zeile = eingabeDaten.readLine();
            //Wenn eine Zeile gelesen wurde, gib sie aus
            //und lese die restlichen Zeilen
            while (zeile != null)
            {
                System.out.println(zeile);
                zeile = eingabeDaten.readLine();
            }
        }
        catch (IOException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}