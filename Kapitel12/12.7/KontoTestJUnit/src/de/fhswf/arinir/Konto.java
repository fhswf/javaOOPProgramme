package de.fhswf.arinir;

// Fachkonzept-Klasse: Konto
public class Konto
{
    //Attribute
    private int kontonr;
    private int kontostand; //Angaben in Cent

    //Konstruktor
    public Konto(int kontonr, int ersteZahlung)
    {
        this.kontonr = kontonr;
        kontostand = ersteZahlung;
    }

    public int getKontostand()
    {
        return kontostand;
    }

    public void buchen(int betrag) throws Exception
    {
        if ((betrag < -10000) || (betrag > 10000))
            throw new Exception("Betrag muss größer oder gleich-10 000 und " + "kleiner oder gleich +10 000 sein");
        kontostand = kontostand + betrag;
    }
}