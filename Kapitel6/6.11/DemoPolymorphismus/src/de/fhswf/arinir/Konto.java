package de.fhswf.arinir;

public class Konto
{
    private int kontostand = 0; //in Cent
    private int kontonr = 0;

    //Konstruktor
    public Konto(int kontonr, int kontostand)
    {
        this.kontonr = kontonr;
        this.kontostand = kontostand;
    }

    public int getKontonr()
    {
        return kontonr;
    }

    public int getKontostand()
    {
        return kontostand;
    }

    public void buchen(int betrag)
    {
        kontostand = kontostand + betrag;
    }
}