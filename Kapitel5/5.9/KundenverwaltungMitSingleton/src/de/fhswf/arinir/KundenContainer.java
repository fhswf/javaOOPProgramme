package de.fhswf.arinir;

//Container mit Singleton-Muster

import java.util.*;

public class KundenContainer
{
    //Attribut
    private ArrayList<Kunde> meineKunden = new ArrayList<>();

    //Klassen-Attribut
    //Speichert Referenz auf das einzige Objekt
    private static KundenContainer einKundenContainer = null;

    //Konstruktor, von außen nicht zugreifbar
    private KundenContainer()
    {
    }

    //Klassen-Operation, die die Objektreferenz liefert
    //Wenn Objekt noch nicht vorhanden, dann wird es erzeugt
    public static KundenContainer getObjektreferenz()
    {
        if (einKundenContainer == null)
            einKundenContainer = new KundenContainer();
        //Konstruktor, kann nur einmal aufgerufen werden
        return einKundenContainer;
    }

    //Methoden
    public void insertKunde(Kunde einKunde)
    {
        meineKunden.add(einKunde);
    }

    public ArrayList<Kunde> alleKunden()
    {
        return meineKunden;
    }
}