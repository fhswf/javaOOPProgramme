package de.fhswf.arinir;

public class Anzeige
{

    //Objektattribute
    private String rubrik, titel, beschreibung;
    private int preis; //in Eurocent

    //Klassenattribute
    private static int mwstvoll; //in Prozent
    private static int grundpreis; //in Eurocent
    private static int preisfaktor;

    //Konstruktor
    public Anzeige(String titel)
    {
        this.titel = titel;
    }

    //Lesende Objektoperationen
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

    public int berechneAnzeigenpreis()
    {
        String text = getBeschreibung();
        int anzahlZeichen = text.length();
        preis = (int) Math.round((anzahlZeichen * Anzeige.preisfaktor + Anzeige.grundpreis)
                * (Anzeige.mwstvoll + 100) / 100.0);
        return preis;
    }

    //Schreibende Objektoperationen
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

    public static int getGrundpreis()
    {
        return Anzeige.grundpreis;
    }

    public static int getPreisfaktor()
    {
        return Anzeige.preisfaktor;
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
}
