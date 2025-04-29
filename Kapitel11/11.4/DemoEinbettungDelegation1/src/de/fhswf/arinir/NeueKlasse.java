package de.fhswf.arinir;

public class NeueKlasse
{
    private Oberklasse ok;//Einbettung

    public NeueKlasse()
    {
        ok = new Oberklasse();
    }

    public void methodeNeu()
    {
        ok.methode1(); //Delegation
    }
}