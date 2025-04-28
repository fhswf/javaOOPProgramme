package de.fhswf.arinir;

import java.util.ArrayList;

public class Kunde
{
    //Attribute
    private int kundennr;
    private String name = "";
    private String telefon = "";
    private int blz;
    private int kontonr;

    //Klasse Kunde verwaltet
    //n Anzeigen-Referenzen
    private ArrayList<Anzeige> anzeigen = new ArrayList<>();

    //Konstruktor
    public Kunde(int kundennr, String name, String telefon, int blz, int kontonr)
    {
        this.kundennr = kundennr;
        this.name = name;
        this.telefon = telefon;
        this.blz = blz;
        this.kontonr = kontonr;
    }

    public Kunde()
    {
    }

    public int getKundennr()
    {
        return kundennr;
    }

    public void setKundennr(int kundennr)
    {
        this.kundennr = kundennr;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    public int getBlz()
    {
        return blz;
    }

    public void setBlz(int blz)
    {
        this.blz = blz;
    }

    public int getKontonr()
    {
        return kontonr;
    }

    public void setKontonr(int kontonr)
    {
        this.kontonr = kontonr;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Anzeige> getAnzeigen()
    {
        return anzeigen;
    }

    public void setAnzeigen(ArrayList<Anzeige> anzeigen)
    {
        this.anzeigen = anzeigen;
    }

    //Assoziationsoperationen
    //Verbindung zu Anzeigen herstellen
    public void setLinkAnzeige(Anzeige eineAnzeige)
    {
        //Eine Anzeige hinzufügen
        anzeigen.add(eineAnzeige);
        //Bei Anzeige dafür sorgen, dass
        //dort ein Kunde eingetragen wird
        eineAnzeige.setLinkKunde(this);
    }

    //Verbindung zu Anzeige löschen
    public void removeLinkAnzeige(Anzeige eineAnzeige)
    {
        anzeigen.remove(eineAnzeige);
        eineAnzeige.removeLinkKunde(this);
    }

    //Liefert alle Anzeigen eines Kunden
    public ArrayList<Anzeige> alleAnzeigen()
    {
        return anzeigen;
    }
}