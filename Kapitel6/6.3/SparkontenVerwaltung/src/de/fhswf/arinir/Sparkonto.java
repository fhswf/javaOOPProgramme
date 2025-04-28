package de.fhswf.arinir;

public class Sparkonto extends Konto
{
    //Konstruktor
    public Sparkonto(Kunde meinKunde)
    {
        super(meinKunde);
    }

    @Override
    public void buchen(int betrag)
    {
        if (getKontostand() + betrag > 0)
            super.buchen(betrag);
    }
}