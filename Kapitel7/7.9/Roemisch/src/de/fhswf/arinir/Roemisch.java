package de.fhswf.arinir;

//Beispiel für Aufzählungen mit Attributen
public class Roemisch
{
    //enum als innere Klasse
    public enum Roman
    {
        I(1), V(5), X(20), L(50), C(100), D(500), M(1000);
        private final int wert;

        //Konstruktor
        Roman(int wert)
        {
            this.wert = wert;
        }

        //get-Methode
        public int getWert()
        {
            return wert;
        }
    }

    public static void main(String args[])
    {
        System.out.println(Roman.I);
        System.out.println(Roman.I.getWert());
        System.out.println(Roman.I.ordinal());
        for (Roman r : Roman.values())
            System.out.println(r + "\t" + r.getWert() + "\t" + r.ordinal());
    }
}