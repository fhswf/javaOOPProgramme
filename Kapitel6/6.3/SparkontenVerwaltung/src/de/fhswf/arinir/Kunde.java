package de.fhswf.arinir;

public class Kunde
{
    //Attribute
    private Konto meinKonto = null;
    private Sparkonto meinSparkonto = null;
    private String name = "";

    //Konstruktor
    public Kunde(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Konto getMeinKonto()
    {
        return meinKonto;
    }

    public void setMeinKonto(Konto meinKonto)
    {
        this.meinKonto = meinKonto;
    }

    public Sparkonto getMeinSparkonto()
    {
        return meinSparkonto;
    }

    public void setMeinSparkonto(Sparkonto meinSparkonto)
    {
        this.meinSparkonto = meinSparkonto;
    }
}