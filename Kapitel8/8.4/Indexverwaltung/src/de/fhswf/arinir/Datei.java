package de.fhswf.arinir;

import java.io.*;

public class Datei
{
    private RandomAccessFile eineStammdatei;
    private int aktuell;
    //aktuelle Position des Dateizeigers
    private final int SATZLAENGE = 100;
    // Dateiname
    private String dateiname = "Stammdatei.txt";

    //Konstruktor
    public Datei()
    {
        oeffneDatei(dateiname);
    }

    //Methoden
    public void speichereSatz(String satz, int index) throws IOException
    {
        //Speichert einen Datensatz Satz an einer
        //Position index in der Datei
        if (eineStammdatei != null)
        {
            positioniereAufSatz(index);
            //interne Hilfsoperation
            writeFixedString(satz, SATZLAENGE);
            //interne Hilfsoperation
        }
    }

    public String leseSatz(int index) throws IOException
    {
        //Liest den Datensatz index aus der Datei
        //und gibt ihn als String zurück
        if (eineStammdatei != null)
        {
            positioniereAufSatz(index);
            //interne Hilfsoperation
            return readFixedString(SATZLAENGE);
            //interne Hilfsoperation
        }
        else
            return null;
    }

    public void oeffneDatei(String name)
    {
        //Öffnen der Datei zum Lesen und Schreiben
        try
        {
            eineStammdatei = new RandomAccessFile(name, "rw");
        }
        catch (IOException e)
        {
            //Testausgabe
            System.out.println("Datei:oeffneDatei: " + e);
        }
    }

    public void schliesseDatei()
    {
        // Schließen der Datei
        try
        {
            eineStammdatei.close();
        }
        catch (IOException e)
        {
            //Testausgabe
            System.out.println("Datei:schliesseDatei: " + e);
        }
    }

    public int gibAnzahlDatensaetze()
    {
        // Rückgabe der Dateilänge in Datensätzen (!)
        long anzahl = 0;
        try
        {
            anzahl = eineStammdatei.length();
        }
        catch (IOException e)
        {
            //Testausgabe
            System.out.println("Datei:gibAnzahlDatensaetze: " + e);
        }
        return (int) (anzahl / (long) (SATZLAENGE * 2));
        //Umrechnung auf Anzahl Datensätze
    }

    //Hilfsoperationen -------------------------------------
    private void positioniereAufSatz(int index) throws IOException
    {
        // Positioniert in der Datei auf den 
        // Datensatz mit der Position index
        if (eineStammdatei != null)
        {
            try
            {
                //für 1 char werden 2 bytes benötigt
                eineStammdatei.seek(index * SATZLAENGE * 2);

            }
            catch (IOException e)
            {
                //Testausgabe
                System.out.println("Datei:positioniereAufSatz: " + e);
            }
        }
    }

    private String readFixedString(int Laenge) throws IOException
    {
        // Liest einen String der festen Länge Laenge
        //(Unicode = 1 Zeichen = 2 Byte) ein
        StringBuilder einPuffer = new StringBuilder(Laenge);
        int i = 0;
        while (i < Laenge)
        {
            char Zeichen = eineStammdatei.readChar();
            i++;
            if (Zeichen == 0) //Ende der Nutzdaten
            {
                //eineStammdatei.skipBytes(2*(Laenge-i));
                //Rest mit 0 überlesen
                //wird benötigt, wenn hinter dem String
                //z.B. noch Zahlen kommen
                return einPuffer.toString();
            } else einPuffer.append(Zeichen);
            //Anhängen an den Puffer
        }
        return einPuffer.toString();
    }

    private void writeFixedString(String einDatensatz, int Laenge) throws IOException
    {
        // Schreibt einen String einDatensatz der 
        //festen Länge Laenge weg
        for (int i = 0; i < Laenge; i++)
        {
            char Zeichen = 0;
            if (i < einDatensatz.length())
                Zeichen = einDatensatz.charAt(i);
            //liefert das Zeichen an der i-ten Stelle
            //Der Rest wird mit 0 aufgefüllt
            eineStammdatei.writeChar(Zeichen);
            //zeichenweises Schreiben in die Stammdatei
        }
    }

    // Zum Testen
    public void gibDatensaetzeAus()
    {
        int anzahl = gibAnzahlDatensaetze();
        System.out.println("Anzahl der Datensätze: " + anzahl);
        for (int i = 0; i < anzahl; i++)
        {
            try
            {
                System.out.println(leseSatz(i));
            }
            catch (IOException e)
            {
                System.out.println("Fehler beim Satzlesen: " + e);
            }
        }
    }
}
