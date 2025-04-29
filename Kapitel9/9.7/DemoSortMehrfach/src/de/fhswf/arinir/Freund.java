package de.fhswf.arinir;

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
}