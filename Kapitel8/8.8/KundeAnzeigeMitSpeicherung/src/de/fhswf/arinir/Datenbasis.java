package de.fhswf.arinir;

/**
 * Programmname: Kunden- und Anzeigenverwaltung
 * Fachkonzept-Klasse: Datenbasis
 * Aufgabe: Schaffung einer künstlichen Wurzelklasse
 * zur Serialisierung aller
 * Kunden und Anzeigen in einem ObjectStream
 */

import java.util.*;

public class Datenbasis
{
    private ArrayList<Kunde> meineKunden = new ArrayList<>();
    private ArrayList<Anzeige> meineAnzeigen = new ArrayList<>();

    public Datenbasis()
    {
    }

    public ArrayList<Kunde> getMeineKunden()
    {
        return meineKunden;
    }

    public ArrayList<Anzeige> getMeineAnzeigen()
    {
        return meineAnzeigen;
    }

    public void setMeineKunden(ArrayList<Kunde> meineKunden)
    {
        this.meineKunden = meineKunden;
    }

    public void setMeineAnzeigen(ArrayList<Anzeige> meineAnzeigen)
    {
        this.meineAnzeigen = meineAnzeigen;
    }
}