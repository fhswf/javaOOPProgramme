package de.fhswf.arinir;

import java.util.Comparator;

public class Freund implements Comparable<Freund>
{
    private String nachname, vorname;
    private int alter;

    Freund(String nachname, String vorname, int alter)
    {
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
    }

    //get-Methoden
    public String getNachname()
    {
        return nachname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public int getAlter()
    {
        return alter;
    }

    //Standardsortierung nach Nachname
    public int compareTo(Freund einFreund) throws ClassCastException
    {
        return (this.nachname.compareTo(einFreund.getNachname()));
    }

    //Anonyme eingeschachtelte Klassen-----------------
    public static final Comparator<Freund> vornameComparator = //Anweisung
            new Comparator<Freund>() //anonyme Klasse
                    //implementiert Schnittstelle Comparator<Freund>
            {
                //Klassenrumpf der anonymen Klasse
                public int compare(Freund freund1, Freund freund2)
                {
                    String vorname1 = freund1.getVorname();
                    String vorname2 = freund2.getVorname();
                    return vorname1.compareTo(vorname2);
                }
            };
    public static final Comparator<Freund> alterComparator = //Anweisung
            new Comparator<Freund>() //anonyme Klasse
                    //implementiert Schnittstelle Comparator<Freund>
            {
                //Klassenrumpf der anonymen Klasse
                public int compare(Freund freund1, Freund freund2)
                {
                    int alter1 = freund1.getAlter();
                    int alter2 = freund2.getAlter();
                    return alter1 - alter2;
                }
            };
}