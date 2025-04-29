package de.fhswf.arinir;

public class Freund
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

    //Altersunterschied
    public int alterUnterschied(Freund einFreund)
    {
        return alter - einFreund.alter;
    }

    public String toString()
    {
        return String.format("%s- %s- %d", nachname, vorname, alter);
    }
}