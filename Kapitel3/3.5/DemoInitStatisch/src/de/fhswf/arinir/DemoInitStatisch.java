package de.fhswf.arinir;

class DemoInitStatisch
{
    //Klassenattribute
    //Automatische Initialisierung
    private static boolean b;
    private static byte by;
    private static String st;
    //Eigene Initialisierung
    private static char c = 'A';
    private static double d = 3.42567;
    private static String[] st2 = {"Eigene", " ", "Initialisierung"};
    private static int[] messliste = new int[10];

    //Initialisierung eines statischen Feldes
    static
    {
        for (int i = 0; i < messliste.length; i++)
            messliste[i] = i * i;
    }

    public static void main(String[] args)
    {
        //Klassenattribute
        System.out.println("b = " + b);
        System.out.println("by = " + by);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("st = " + st);
        for (String i : st2)
            System.out.println("st2 = " + i);
        for (int i : messliste)
            System.out.println("messliste " + i);
    }
}
