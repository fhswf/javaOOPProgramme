package de.fhswf.arinir;

public class Person
{
    private String familienname, vorname;
    private String hochzeitsdatum; //Format tt.mm.jj
    private Person partner = null;

    public Person(String nachname, String vorname)
    {
        familienname = nachname;
        this.vorname = vorname;
    }

    public String getFamilienname()
    {
        return familienname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getHochzeitsdatum()
    {
        return hochzeitsdatum;
    }

    public Person getPartner()
    {
        return partner;
    }

    public void setPartner(Person partner, String hochzeitsdatum)
    {
        this.partner = partner;
        this.hochzeitsdatum = hochzeitsdatum;
    }
}
