package de.fhswf.arinir;

public class Kunde
{
    //Attribute
    private String name, telefon;
    private int blz, kontonr;

    //Konstruktor
    public Kunde()
    {
    }

    //Lesende Methoden
    public String getName()
    {
        return name;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public int getBLZ()
    {
        return blz;
    }

    public int getKontonr()
    {
        return kontonr;
    }

    //Schreibende Methoden
    public void setName(String name)
    {
        this.name = name;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    public void setBLZ(int blz)
    {
        this.blz = blz;
    }

    public void setKontonr(int kontonr)
    {
        this.kontonr = kontonr;
    }
}
