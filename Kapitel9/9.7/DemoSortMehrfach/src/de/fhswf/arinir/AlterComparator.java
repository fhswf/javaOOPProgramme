package de.fhswf.arinir;

//Vergleich des Alters

import java.util.Comparator;

public class AlterComparator implements Comparator<Freund>
{
    public int compare(Freund freund1, Freund freund2)
    {
        int alter1 = freund1.getAlter();
        int alter2 = freund2.getAlter();
        return alter1 - alter2;
    }
}
