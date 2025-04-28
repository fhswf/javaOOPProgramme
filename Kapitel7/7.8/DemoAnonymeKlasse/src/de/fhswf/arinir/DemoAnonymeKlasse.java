package de.fhswf.arinir;

public class DemoAnonymeKlasse
{
    public static void druckeTabelle(BerechnungDouble methode)
    {
        System.out.println("Wertetabelle");
        for (int x = 0; x <= 5; x++)
        {
            System.out.println(x + "-> " + methode.berechne(x));
        }
    }

    public static void main(String[] args)
    {
        druckeTabelle(
                new BerechnungDouble() //anonyme Klasse implementiert
                        //Schnittstelle BerechnungDouble
                {
                    //Methode der anonymen Klasse
                    public double berechne(double wert)
                    {
                        return Math.sqrt(wert);
                    }
                }//Ende der anonymen Klasse
        );//Ende der Methodenaufrufs druckeTabelle
    }
}
