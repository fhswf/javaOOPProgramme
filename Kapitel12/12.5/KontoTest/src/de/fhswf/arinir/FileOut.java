package de.fhswf.arinir;

/**
 * Methoden zum zeilenweisen Schreiben
 * in eine Textdatei
 */

import java.io.*;

public class FileOut
{
    private PrintWriter out;

    public FileOut(String outfilename)
    {
        this.oeffneAusgabedatei(outfilename);
    }

    private void oeffneAusgabedatei(String outfilename)
    {
        try
        {
            FileWriter outfile = new FileWriter(outfilename, true);
            out = new PrintWriter(outfile, true);
        }
        catch (IOException io)
        {
            System.out.println("Fehler beim Öffnen der Datei " + outfilename);
            System.exit(1);
        }
    }

    public void schreibeNaechsteZeile(String zeile)
    {
        if (out == null)
        {
            System.out.println("Es ist keine Datei zum Schreiben geladen.");
            System.exit(1);
        }
        out.println(zeile);
    }

    public void schliesseAusgabedatei()
    {
        if (out != null)
            out.close();
    }
}