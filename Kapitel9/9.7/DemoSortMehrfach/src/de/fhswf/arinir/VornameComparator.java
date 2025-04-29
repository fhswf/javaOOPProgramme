package de.fhswf.arinir;

//Vergleich der Vornamen

import java.util.Comparator;

public class VornameComparator implements Comparator<Freund>
{
    public int compare(Freund freund1, Freund freund2)
    {
        String vorname1 = freund1.getVorname();
        String vorname2 = freund2.getVorname();
        return vorname1.compareTo(vorname2);
    }
}