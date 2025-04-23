package de.fhswf.arinir;

// Beispiel für das Klonen eines Objekts
public class Mitarbeiter
{
    //Attribute
    private String vorname, nachname, adresse;

    //Konstruktoren
    public Mitarbeiter(String vorname, String nachname, String adresse)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    //Kopier-Konstruktor
    //Übergabe des zu kopierenden Objekts als Parameter
    public Mitarbeiter(Mitarbeiter mitarbeiterAlt)
    {
        this(mitarbeiterAlt.vorname, mitarbeiterAlt.nachname, mitarbeiterAlt.adresse);
    }

    //get- und set-Methoden, Auswahl
    public String getNachname()
    {
        return nachname;
    }

    public String getAdresse()
    {
        return adresse;
    }
}

