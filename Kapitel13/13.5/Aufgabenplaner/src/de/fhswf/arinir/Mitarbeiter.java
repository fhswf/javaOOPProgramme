package de.fhswf.arinir;

/**
 * Fachkonzeptklasse Mitarbeiter
 */

public class Mitarbeiter extends Person
{
    private String abteilung;

    // Standard-Konstruktor
    public Mitarbeiter()
    {
    }

    //weiterer Konstruktor
    public Mitarbeiter(String spitzname, String nachname, String vorname, String telefon, String email, String abteilung)
    {
        super(spitzname, nachname, vorname, telefon, email);
        this.abteilung = abteilung;
    }

    public String getAbteilung()
    {
        return this.abteilung;
    }

    public void setAbteilung(String abteilung)
    {
        this.abteilung = abteilung;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Mitarbeiter";
    }
}