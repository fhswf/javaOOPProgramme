package de.fhswf.arinir;

public class Freund implements Comparable<Freund>
{
    private String nachname, vorname;

    Freund(String nachname, String vorname)
    {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public int compareTo(Freund einFreund) throws ClassCastException
    {
        return (this.nachname.compareTo(einFreund.getNachname()));
    }
}