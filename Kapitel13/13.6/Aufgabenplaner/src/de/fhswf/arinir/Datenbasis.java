package de.fhswf.arinir;

/**
 * Programmname: Aufgabenplaner
 * Fachkonzept-Klasse: Datenbasis
 * Aufgabe: Schaffung einer künstlichen Wurzelklasse
 * zur Serialisierung aller
 * Aufgaben, Kontaktpersonen und Mitarbeiter
 * in einem ObjectStream
 */

import java.io.Serializable;
import java.util.*;

public class Datenbasis implements Serializable
{
    private ArrayList<Aufgabe> meineAufgaben = new ArrayList<>();
    private ArrayList<Person> meinePersonen = new ArrayList<>();

    public ArrayList<Aufgabe> getMeineAufgaben()
    {
        return meineAufgaben;
    }

    public void setMeineAufgaben(ArrayList<Aufgabe> meineAufgaben)
    {
        this.meineAufgaben = meineAufgaben;
    }

    public ArrayList<Person> getMeinePersonen()
    {
        return meinePersonen;
    }

    public void setMeinePersonen(ArrayList<Person> meinePersonen)
    {
        this.meinePersonen = meinePersonen;
    }
}