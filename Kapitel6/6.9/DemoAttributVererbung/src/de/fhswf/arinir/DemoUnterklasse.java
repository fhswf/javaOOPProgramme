package de.fhswf.arinir;

public class DemoUnterklasse extends DemoOberklasse
{
    //Überdeckt Oberklassenattribut
    private int attribut = 456;

    public int getAttribut()
    {
        //Holt Oberklassenattribut
        return super.attribut;
    }
}