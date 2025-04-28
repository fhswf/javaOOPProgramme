package de.fhswf.arinir;


public class Anzeige
{
    //Objektattribute
    private int anzeigennr;
    private String rubrik;
    private String titel;
    private String beschreibung;
    private int preis; //in Eurocent
    //Klassenattribute
    private static int mwstvoll; //in Prozent
    private static int grundpreis; //in Eurocent
    private static int preisfaktor;

    //Verwaltung der Assoziation
    //Inserent ist der Assoziationsname
    private Kunde inserent;

    //Konstruktoren
    public Anzeige()
    {
    }

    public Anzeige(int anzeigennr, String titel)
    {
        this.anzeigennr = anzeigennr;
        this.titel = titel;
    }

    //Lesende Objektoperationen
    public int getAnzeigennr()
    {
        return anzeigennr;
    }

    public String getRubrik()
    {
        return rubrik;
    }

    public String getTitel()
    {
        return titel;
    }

    public String getBeschreibung()
    {
        return beschreibung;
    }

    public int getPreis()
    {
        return preis;
    }

    public int berechneAnzeigenpreis()
    {
        String text = getBeschreibung();
        int anzahlZeichen = text.length();
        preis = (anzahlZeichen * Anzeige.preisfaktor +
                Anzeige.grundpreis) * ((Anzeige.mwstvoll + 100) / 100);
        return preis;
    }

    //Schreibende Objektoperationen
    public void setAnzeigennr(int anzeigennr)
    {
        this.anzeigennr = anzeigennr;
    }

    public void setRubrik(String rubrik)
    {
        this.rubrik = rubrik;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public void setBeschreibung(String beschreibung)
    {
        this.beschreibung = beschreibung;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    //Lesende Klassenoperationen
    public static int getMwstvoll()
    {
        return Anzeige.mwstvoll;
    }

    //Schreibende Klassenoperationen
    public static void setMwstvoll(int mwst)
    {
        Anzeige.mwstvoll = mwst;
        //alternativ: mwstvoll = mwst erlaubt
        //da Operationen der eigenen Klasse
        //immer auch auf die Attribute der eigenen
        //Klasse direkt zugreifen können
    }

    public static void setGrundpreis(int grundpreis)
    {
        Anzeige.grundpreis = grundpreis;
    }

    public static void setPreisfaktor(int preisfaktor)
    {
        Anzeige.preisfaktor = preisfaktor;
    }

    //Assoziationsoperationen---------------------------------
    //Verbindung zu Kunde herstellen
    public void setLinkKunde(Kunde einKunde)
    {
        //Wird von Kunden-Objekt aufgerufen
        inserent = einKunde;
    }

    //Referenz zu Kunde übergeben
    public Kunde getLinkKunde()
    {
        //Wird von Kunden-Objekt aufgerufen
        return inserent;
    }

    //Verbindung zu Kunde löschen
    public void removeLinkKunde(Kunde einKunde)
    {
        //Wird von Kunden-Objekt aufgerufen
        inserent = null;
    }
}