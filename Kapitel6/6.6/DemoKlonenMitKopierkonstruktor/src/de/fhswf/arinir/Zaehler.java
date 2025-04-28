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

    //Kopier-Konstruktor
    Zaehler(Zaehler einZaehler)
    {
        this.zaehlerart = einZaehler.zaehlerart;
        this.zaehlerstand = einZaehler.zaehlerstand;
        //neuer Verbraucher- tiefe Kopie
        Verbraucher alterVerbraucher =
                einZaehler.getMeinVerbraucher();
        this.meinVerbraucher = new Verbraucher(alterVerbraucher.getName());
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