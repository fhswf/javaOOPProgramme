package de.fhswf.arinir;

public class Anzeige
{
    //Objektattribute
    private String titel;
    private int preis; //in Eurocent

    //Konstruktor
    public Anzeige(String titel)
    {
        this.titel = titel;
    }

    //Lesende Objektoperationen
    public String getTitel()
    {
        return titel;
    }

    public int getPreis()
    {
        return preis;
    }

    //Schreibende Objektoperationen
    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }
}