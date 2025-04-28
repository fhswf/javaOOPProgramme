package de.fhswf.arinir;

public class Einfamilienhaus extends Immobilie
{
    //Attribute
    private String haustyp = "Stadthaus";

    //Konstruktor
    public Einfamilienhaus(String besitzer, int verkaufspreis, String haustyp)
    {
        super(besitzer, verkaufspreis);
        this.haustyp = haustyp;
    }

    public String getHaustyp()
    {
        return haustyp;
    }
}