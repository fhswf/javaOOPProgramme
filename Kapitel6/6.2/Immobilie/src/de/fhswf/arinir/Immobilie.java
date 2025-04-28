package de.fhswf.arinir;

public abstract class Immobilie
{
    //Attribute
    protected String besitzer = "";
    private int verkaufspreis = 0;

    //Konstruktor
    protected Immobilie(String besitzer, int verkaufspreis)
    {
        this.besitzer = besitzer;
        this.verkaufspreis = verkaufspreis;
    }

    public String getBesitzer()
    {
        return besitzer;
    }

    public int getVerkaufspreis()
    {
        return verkaufspreis;
    }
}