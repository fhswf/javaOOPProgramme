package de.fhswf.arinir;

public class Zaehler extends Object implements Cloneable
        //extends Object kann auch weggelassen werden
        //gilt implizit
{
    //Attribute
    private int zaehlerstand = 0;
    private String zaehlerart = "";
    private Verbraucher meinVerbraucher = null;

    //Konstruktor
    Zaehler(String zaehlerart, Verbraucher meinVerbraucher, int zaehlerstand)
    {
        this.zaehlerart = zaehlerart;
        this.meinVerbraucher = meinVerbraucher;
        this.zaehlerstand = zaehlerstand;
    }

    //Methoden
    public int getZaehlerstand()
    {
        return zaehlerstand;
    }

    public String getZaehlerart()
    {
        return zaehlerart;
    }

    public Verbraucher getMeinVerbraucher()
    {
        return meinVerbraucher;
    }

    //Redefinierte Methoden
    @Override
    public Zaehler clone() throws CloneNotSupportedException
    {
        return (Zaehler) super.clone();
    }
}