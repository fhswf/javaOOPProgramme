package de.fhswf.arinir;

/**
 * Methoden zum zeilenweisen Einlesen von
 * Informationen aus einer Textdatei
 */

import java.io.*;

public class FileIn
{
    private BufferedReader in;
    private String filenameIn;

    public FileIn(String infilename)
    {
        this.oeffneEingabedatei(infilename);
    }

    private void oeffneEingabedatei(String infilename)
    {
        filenameIn = infilename;
        try
        {
            FileReader infile = new FileReader(infilename);
            in = new BufferedReader(infile);
        }
        catch (IOException io)
        {
            System.out.println("Fehler beim Öffnen der Datei " + infilename);
            System.exit(1);
        }
    }

    public String gibNaechsteZeile()
    {
        if (in == null)
        {
            System.out.println("Keine Datei zum Lesen geöffnet");
            System.exit(1);
        }
        String zeile = null;
        try
        {
            if ((zeile = in.readLine()) != null)
                return zeile;
        }
        catch (IOException io)
        {
            System.out.println("Fehler beim Lesen einer Zeile aus der Datei " + filenameIn);
            System.exit(1);
        }
        return zeile;
    }

    public void schliesseEingabedatei()
    {
        if (in != null)
        {
            try
            {
                in.close();

            }
            catch (IOException io)
            {
                System.out.println("Fehler beim Schließen der Datei " + filenameIn);
                System.exit(1);
            }
        }
    }
}
