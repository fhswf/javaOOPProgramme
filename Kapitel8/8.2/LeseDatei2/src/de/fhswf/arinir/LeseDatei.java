package de.fhswf.arinir;

//Liest einen Text aus einer Textdatei

import java.io.*;

class LeseDatei
{
    public static void main(String args[])
    {
        try (FileReader eineEingabeDatei = new FileReader("src/de/fhswf/arinir/LeseDatei.java"))
        {
            int c;
            while ((c = eineEingabeDatei.read()) != -1)
                System.out.print((char) c);

        }
        catch (IOException eineAusnahme)
        {
            System.out.println("Fehlermeldung: " + eineAusnahme);
        }
    }
}