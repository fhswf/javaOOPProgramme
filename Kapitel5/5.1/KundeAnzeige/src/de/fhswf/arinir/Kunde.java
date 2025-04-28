package de.fhswf.arinir;

//Verwaltung von Referenzen
public class Kunde
{
    //Attribute
    private String name;

    //Referenzattribut
    private Anzeige eineAnzeige;

    //Konstruktor
    public Kunde()
    {
    }

    //Lesende Objektoperationen
    public String getName()
    {
        return name;
    }

    /**
     * Referenz auf Anzeige lesen
     */
    public Anzeige getLinkAnzeige()
    {
        return eineAnzeige;
    }


    //Schreibende Objektoperationen
    public void setName(String kundenname)
    {
        name = kundenname;
    }

    public Anzeige erzeugeAnzeige(String titel, int preis)
    {
        Anzeige neueAnzeige;
        neueAnzeige = new Anzeige(titel);
        neueAnzeige.setPreis(preis);
        return neueAnzeige;
    }

    /**
     * Verbindung zu Anzeige herstellen
     */
    public void setLinkAnzeige(Anzeige eineAnzeige)
    {
        this.eineAnzeige = eineAnzeige;
    }

    /**
     * Referenz zu Anzeige löschen
     */
    public void removeLinkAnzeige()
    {
        eineAnzeige = null;
    }
}