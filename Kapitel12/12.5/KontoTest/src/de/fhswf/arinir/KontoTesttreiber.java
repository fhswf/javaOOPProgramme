package de.fhswf.arinir;

import java.util.*;

class KontoTesttreiber
{
    /**
     * Durchführung einer Testreihe.
     *
     * @param inFile
     * @param outFile
     * @param testfall Welcher Testfall soll ausgeführt werden.
     */
    private static void testreihe(FileIn inFile, FileOut outFile, String testfall)
    {
        String zeile = inFile.gibNaechsteZeile();
        while (zeile != null)
        {
            if (testfall.equals("KontoKonstruktor"))
                KontoTesttreiber.testfallKonto(zeile, outFile);
            if (testfall.equals("KontoBuchen"))
                KontoTesttreiber.testfallBuchen(zeile, outFile);
            zeile = inFile.gibNaechsteZeile(); //nächster Testfall
        } //Ende while

        int[] ueberdeckung = Konto.getDurchlauf();
        for (int i = 0; i < ueberdeckung.length; i++)
            System.out.println("Testüberdeckung Zweig " + i + ": " + ueberdeckung[i]);
    }

    /**
     * Durchführung eines Testfalls für den Konstruktor
     * Konto().
     *
     * @param zeile
     * @param outFile
     */
    private static void testfallKonto(String zeile, FileOut outFile)
    {
        int kontonr, kontostand, ersteZahlung;
        Konto einKonto;
        Scanner sc;
        String testfall = " ";
        sc = new Scanner(zeile);
        //Separieren der Textzeile
        testfall = sc.next();
        kontonr = sc.nextInt();
        ersteZahlung = sc.nextInt();
        try
        {
            //Für jeden Testfall Objekt neu anlegen
            einKonto = new Konto(kontonr, ersteZahlung);
            kontostand = einKonto.getKontostand();
            String testergebnis = testfall + ": " + kontostand;
            //Ergebnis in Datei schreiben
            outFile.schreibeNaechsteZeile(testergebnis);

            System.out.println("Testfall: " + testfall + "--");
            System.out.print("Kontonr: " + kontonr);
            System.out.print(" | 1. Zahlung: " + ersteZahlung);
            System.out.println(" | Kontostand: " + kontostand);
        }
        catch (Exception e)
        {
            outFile.schreibeNaechsteZeile(testfall + ": Fehler");
            System.out.println("Testfall: " + testfall + "--");
            System.out.print("Kontonr: " + kontonr);
            System.out.print(" | 1. Zahlung: " + ersteZahlung);
            System.out.println(" | Fehler: \n" + e.getMessage());
        }
    }

    private static void testfallBuchen(String zeile, FileOut outFile)
    {
        int kontostand;
        Konto einKonto;
        Scanner sc;
        String testfall = " ";
        try
        {
            sc = new Scanner(zeile);
            testfall = sc.next();
            int betrag = sc.nextInt(); //Einlesen Testfall
            //Für jeden Testfall erneut Objekt anlegen
            //Feste Werte für Konto-Objekt, kontonr = 22
            //ersteZahlung = 100 Cent
            einKonto = new Konto(22, 100);
            einKonto.buchen(betrag);
            kontostand = einKonto.getKontostand();
            String testergebnis = testfall + ": " + Integer.toString(kontostand);
            outFile.schreibeNaechsteZeile(testergebnis);
            System.out.print("Testfall: " + testfall + "-------------");
            System.out.println("Kontostand: " + kontostand);
        }
        catch (Exception e)
        {
            outFile.schreibeNaechsteZeile(testfall + ": Fehler");
            System.out.print("Testfall: " + testfall + "--");
            System.out.println("Fehler: \n" + e.getMessage());
        }
    }


    public static void main(String args[])
    {
        System.out.println("Testfälle A bis F **************");

        //Übernahme des Namens der Eingabedatei von args[0]
        String filenameIn = args[0];
        //String filenameIn = "testfile1";
        //Eingabedatei öffnen
        FileIn inFile = new FileIn(filenameIn);

        //Übernahme des Namens der Ausgabedatei von args[1]
        String filenameOut = args[1];
        //String filenameOut = "testfile_output";
        // Ausgabedatei öffnen
        FileOut outFile = new FileOut(filenameOut);
        //Testreihe aufrufen
        KontoTesttreiber.testreihe(inFile, outFile, "KontoKonstruktor");
        //Eingabedatei schließen
        inFile.schliesseEingabedatei();
        System.out.println("Testfälle G bis J **************");
        //Übernahme des Namens der Eingabedatei von args[2]
        filenameIn = args[2];
        //filenameIn = "testfile2";
        //Datei öffnen
        inFile = new FileIn(filenameIn);
        //Testreihe aufrufen
        KontoTesttreiber.testreihe(inFile, outFile, "KontoBuchen");
        inFile.schliesseEingabedatei();
        outFile.schliesseAusgabedatei();
    }
}