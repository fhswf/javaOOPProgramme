package de.fhswf.arinir;

// Fachkonzept-Klasse: Konto
public class Konto
{
    //manuelle Instrumentierung
    private static int[] durchlauf = {0, 0, 0, 0, 0, 0, 0};
    private int kontonr;
    private int kontostand; //Angaben in Cent

    //Konstruktor
    public Konto(int kontonr, int ersteZahlung) throws Exception
    {
        if ((kontonr < 0) || (kontonr > 999))
        {
            durchlauf[0]++;
            System.out.println("Zweig 0: " + durchlauf[0]);
            throw new Exception("Kontonummer muss größer oder gleich Null " + "und kleiner 1 000 sein");
        }
        else
        {
            durchlauf[1]++;
            System.out.println("Zweig 1: " + durchlauf[1]);
        }
        if ((ersteZahlung < 1) || (ersteZahlung > 10000))
        {
            durchlauf[2]++;
            System.out.println("Zweig 2: " + durchlauf[2]);
            throw new Exception("Die erste Zahlung muss größer oder gleich 1 " + "und kleiner oder gleich 10 000 sein");
        }
        else
        {
            durchlauf[3]++;
            System.out.println("Zweig 3: " + durchlauf[3]);
            this.kontonr = kontonr;
            kontostand = ersteZahlung;
        }
    }

    //Methoden
    public void buchen(int betrag) throws Exception
    {
        if ((betrag < -10000) || (betrag > 10000))
        {
            durchlauf[4]++;
            System.out.println("Zweig 4: " + durchlauf[4]);
            throw new Exception("Betrag muss größer oder gleich-10 000 und " + "kleiner oder gleich +10 000 sein");
        }
        else
        {
            durchlauf[5]++;
            System.out.println("Zweig 5: " + durchlauf[5]);
            kontostand = kontostand + betrag;
        }
    }

    public int getKontostand()
    {
        durchlauf[6]++;
        System.out.println("Zweig 6: " + durchlauf[6]);
        return kontostand;
    }

    //Überdeckung ausgeben
    public static int[] getDurchlauf()
    {
        return durchlauf;
    }
}