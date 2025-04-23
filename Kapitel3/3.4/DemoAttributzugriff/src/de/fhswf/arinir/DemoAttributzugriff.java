package de.fhswf.arinir;

//Zugriff auf ein Attribut innerhalb
//einer Klasse, das mit public deklariert ist
public class DemoAttributzugriff
{
    public int einAttribut = 100;

    public DemoAttributzugriff()
    {
    }

    public int getEinAttribut()
    {
        int einAttribut = 200;
        return this.einAttribut;
    }

    public static void main(String args[])
    {
        DemoAttributzugriff einObjekt = new DemoAttributzugriff();
        System.out.println("Wert von einAttribut (direkter Attributzugriff): " + einObjekt.einAttribut);
        System.out.println("Wert von einAttribut (Zugriff über Operation): " + einObjekt.getEinAttribut());
    }
}
