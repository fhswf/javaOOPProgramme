package de.fhswf.arinir;

public class Kunde
{

    //Attribute
    private String name, telefon;
    private int blz, kontonr;

    //Klassenattribut
    private static int kundenanzahl;

    //Konstruktoren
    public Kunde()
    {
        erhoeheKundenanzahl();
    }

    public Kunde(String kundenname)
    {
        this.name = kundenname;
        erhoeheKundenanzahl();
    }

    public Kunde(String kundenname, String telefonnummer)
    {
        name = kundenname;
        telefon = telefonnummer;
        erhoeheKundenanzahl();
    }

    public Kunde(String kundenname, String telefonnummer, int bankleitzahl, int kontonr)
    {
        name = kundenname;
        telefon = telefonnummer;
        blz = bankleitzahl;
        this.kontonr = kontonr;
        erhoeheKundenanzahl();
    }


    //Lesende Objektoperationen
    public String getName()
    {
        return name;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public int getBLZ()
    {
        return blz;
    }

    public int getKontonr()
    {
        return kontonr;
    }

    //Schreibende Objektoperationen
    public void setName(String name)
    {
        this.name = name;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    public void setBLZ(int blz)
    {
        this.blz = blz;
    }

    public void setKontonr(int kontonr)
    {
        this.kontonr = kontonr;
    }

    //Lesende Klassenoperation
    public static int getKundenanzahl()
    {
        return Kunde.kundenanzahl;
    }

    //Schreibende Klassenoperationen
    public static void setKundenanzahl(int anzahl)
    {
        Kunde.kundenanzahl = anzahl;
    }

    public static void erhoeheKundenanzahl()
    {
        Kunde.kundenanzahl++;
    }
}
