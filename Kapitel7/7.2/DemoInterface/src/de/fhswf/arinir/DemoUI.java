package de.fhswf.arinir;

public class DemoUI
{
    public static void main(String args[])
    {
        DemoKlasse einObjekt = new DemoKlasse();
        System.out.println(einObjekt.toString());
        //Schnittstellentyp
        DemoI nocheinObjekt = new DemoKlasse();
        System.out.println(nocheinObjekt.toString());
    }
}