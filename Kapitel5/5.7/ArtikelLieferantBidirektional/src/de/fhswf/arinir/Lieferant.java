package de.fhswf.arinir;

public class Lieferant
{
    private String name;
    //Verwaltung der Assoziation
    //"liefert" ist der Assoziationsname
    private Artikel liefert;

    public Lieferant(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //Assoziationsoperationen
    //Verbindung zu Artikel herstellen
    public void setLinkArtikel(Artikel einArtikel)
    {
        if (liefert != einArtikel)
        {
            //Wird von Artikel-Objekt aufgerufen
            liefert = einArtikel;
            einArtikel.setLinkAnbieter(this);
        }
    }

    //Referenz zu Artikel übergeben
    public Artikel getLinkArtikel()
    {
        //Wird von Artikel-Objekt aufgerufen
        return liefert;
    }

    //Verbindung zu Artikel löschen
    public void removeLinkArtikel(Artikel einArtikel)
    {
        //Wird von Artikel-Objekt aufgerufen
        liefert = null;
    }
}