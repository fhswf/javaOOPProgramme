package de.fhswf.arinir; /**
 * Fachkonzeptklasse Taetigkeit
 */

import java.io.Serializable;
import java.time.LocalDate;

/** Assoziative Klasse zwischen Aufgabe und Mitarbeiter */
public class Taetigkeit implements Serializable
{
    private String beschreibung; //Muss
    private LocalDate endeTermin;
    private Mitarbeiter bearbeiter;

    public Taetigkeit()
    {
    }

    public Taetigkeit(String beschreibung,
                      LocalDate endeTermin, Mitarbeiter bearbeiter)
    {
        this.beschreibung = beschreibung;
        this.endeTermin = endeTermin;
        this.bearbeiter = bearbeiter;
    }

    public String getBeschreibung()
    {
        return this.beschreibung;
    }

    public LocalDate getEndeTermin()
    {
        return this.endeTermin;
    }

    public Mitarbeiter getBearbeiter()
    {
        return this.bearbeiter;
    }
}