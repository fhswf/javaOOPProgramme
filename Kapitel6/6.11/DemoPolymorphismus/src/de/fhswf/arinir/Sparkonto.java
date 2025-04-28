package de.fhswf.arinir;

public class Sparkonto extends Konto
{
    //Konstruktor
    public Sparkonto(int kontonr, int kontostand)
    {
        super(kontonr, kontostand);
    }

    @Override
    public void buchen(int betrag)
    {
        if (getKontostand() + betrag > 0)
            super.buchen(betrag);
    }

    public void buchenSparkonto(int betrag)
    {
        if (getKontostand() + betrag > 0)
            super.buchen(betrag);
    }
}