package de.fhswf.arinir;

public class Geschaeftshaus extends Immobilie
{
    //Attribute
    protected int anzahlBueroraeume = 0;

    //Konstruktor
    public Geschaeftshaus(String besitzer, int verkaufspreis, int anzahlBueroraeume)
    {
        super(besitzer, verkaufspreis);
        this.anzahlBueroraeume = anzahlBueroraeume;
    }

    public int getAnzahlBueroraeume()
    {
        return anzahlBueroraeume;
    }
}
