package de.fhswf.arinir;

// Beispiel für den Einsatz generischer Datentypen
// mit Typeinschränkung
public class MaxGenerischerVergleich
{
    //generische Methodendeklaration
    static <T extends Comparable<T>> T gibMax(T wert1, T wert2)
    {
        if (wert1.compareTo(wert2) > 0)
            return wert1;
        else
            return wert2;
    }

    public static void main(String args[])
    {
        System.out.println("Max " + gibMax(new Double(1.0), new Double(2.0)));
        System.out.println("Max " + gibMax("Z", "A"));
        //Mit Autoboxing
        System.out.println("Max " + gibMax(22, 99));
    }
}