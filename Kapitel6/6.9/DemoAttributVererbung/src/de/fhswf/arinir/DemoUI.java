package de.fhswf.arinir;

public class DemoUI
{
    public static void main(String args[])
    {
        DemoOberklasse einObjekt = new DemoOberklasse();
        System.out.println("Attribut Oberklasse = " + einObjekt.getAttribut());

        DemoUnterklasse nochEinObjekt = new DemoUnterklasse();
        System.out.println("Attribut Unterklasse = " + nochEinObjekt.getAttribut());
    }
}