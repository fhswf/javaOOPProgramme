package de.fhswf.arinir;

class DemoInitialisierung
{
    //Objektattribute (Klasse)
    private float f;
    private int i;
    private long l;
    private short s;
    private String st;

    public static void main(String[] args)
    {
        DemoInitialisierung einObjekt = new DemoInitialisierung();
        //Objektattribute (Klasse)
        System.out.println("f = " + einObjekt.f);
        System.out.println("i = " + einObjekt.i);
        System.out.println("l = " + einObjekt.l);
        System.out.println("s = " + einObjekt.s);
        System.out.println("st = " + einObjekt.st);
        //Objektattribut (Methode)
        String stObjMethode;
        //Meldung des Compilers:
        //The local variable stObjMethode may not have
        //been initialized
        //System.out.println ("stObjMethode = " + stObjMethode);
        String[] feld = new String[5];
        for (String e : feld)
            System.out.print(e);
    }
}
