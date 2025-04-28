package de.fhswf.arinir;

public class DemoHuell
{
    public static void main(String args[])
    {
        int n;
        String einText;
        Integer i;
        einText = "123";
        //Erzeugt ein Integer-Objekt, initialisiert
        //mit dem konvertierten String
        i = Integer.valueOf(einText);
        //Konversion des Objektwertes in einen
        //einfachen Typ int
        n = i.intValue();
        System.out.println("n: " + n);
    }
}