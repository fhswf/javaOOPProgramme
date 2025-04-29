/**
 * Fachkonzeptklasse Aufgabe
 */

package de.fhswf.arinir;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Aufgabe implements Serializable
{
    private String stichwort; //Muss
    private String beschreibung; //Muss
    private LocalDate erfasstAm;
    private LocalDate fertigAm; //Muss wegen Sortierung
    private Prioritaet prioritaet = Prioritaet.C;
    private Kategorie kategorie = Kategorie.Beruf;
    private Status status = Status.NichtBegonnen;

    public static final Map<Aufgabensortierung, Comparator<Aufgabe>> enumAufgabensortierung =
            new HashMap<Aufgabensortierung, Comparator<Aufgabe>>()
            {{
                put(Aufgabensortierung.Endetermin, (a1, a2) -> a1.getFertigAm().compareTo(a2.getFertigAm()));
                put(Aufgabensortierung.Prioritaet, (a1, a2) -> a1.getPrioritaet().compareTo(a2.getPrioritaet()));
                put(Aufgabensortierung.Beruflich, (a1, a2) -> a1.getKategorie().compareTo(a2.getKategorie()));
                put(Aufgabensortierung.Privat, (a1, a2) -> a2.getKategorie().compareTo(a1.getKategorie()));
                put(Aufgabensortierung.Status, (a1, a2) -> a1.getStatus().compareTo(a2.getStatus()));
            }};

    /**Unidirektionale Assoziation zu Person 0..1 */
    //Kontaktperson
    private Person kontaktperson; //Kann

    /**Unidirektionale Assoziation zu Mitarbeiter 0..* */
    //Bearbeiter
    private ArrayList<Taetigkeit> teilaufgaben = new ArrayList<>();

    // Standard-Konstruktor
    public Aufgabe()
    {
    }

    //weiterer Konstruktor
    public Aufgabe(String stichwort, String beschreibung,
                   LocalDate fertigAm, Prioritaet prioritaet, Kategorie kategorie,
                   Status status, Person kontaktperson)
    {
        this.stichwort = stichwort;
        this.beschreibung = beschreibung;
        this.erfasstAm = LocalDate.now(); //Datum der Erfassung
        this.fertigAm = fertigAm;
        //Ueberpruefung auf null hier notwendig, da diese Attribute einen
        //Wert besitzen muessen. Andernfalls treten Probleme beim Sortieren auf
        if (prioritaet != null)
            this.prioritaet = prioritaet; //Kein Pflichtfeld
        if (kategorie != null)
            this.kategorie = kategorie; //Kein Pflichtfeld
        if (kategorie != null)
            this.status = status; //Kein Pflichtfeld
        this.kontaktperson = kontaktperson;
    }

    //get-Methoden
    public String getStichwort()
    {
        return stichwort;
    }

    public String getBeschreibung()
    {
        return beschreibung;
    }

    public LocalDate getFertigAm()
    {
        return fertigAm;
    }

    public Prioritaet getPrioritaet()
    {
        return prioritaet;
    }

    public LocalDate getErfasstAm()
    {
        return erfasstAm;
    }

    public Kategorie getKategorie()
    {
        return kategorie;
    }

    public Status getStatus()
    {
        return status;
    }

    public Person getKontaktperson()
    {
        return kontaktperson;
    }

    //set-Methoden
    public void setStichwort(String stichwort)
    {
        this.stichwort = stichwort;
    }

    public void setBeschreibung(String beschreibung)
    {
        this.beschreibung = beschreibung;
    }

    public void setFertigAm(LocalDate fertigAm)
    {
        this.fertigAm = fertigAm;
    }

    public void setPrioritaet(Prioritaet prioritaet)
    {
        this.prioritaet = prioritaet;
    }

    public void setKategorie(Kategorie kategorie)
    {
        this.kategorie = kategorie;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void setKontaktperson(Person einePerson)
    {
        kontaktperson = einePerson;
    }

    //Teilaufgaben
    public void addTeilaufgabe(Taetigkeit teilaufgabe)
    {
        this.teilaufgaben.add(teilaufgabe);
    }

    public void deleteTeilaufgabe(Taetigkeit teilaufgabe)
    {
        this.teilaufgaben.remove(teilaufgabe);
    }

    public Iterator<Taetigkeit> iteratorTeilaufgaben()
    {
        return this.teilaufgaben.iterator();
    }
}
 