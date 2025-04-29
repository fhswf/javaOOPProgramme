package de.fhswf.arinir; /**
 * Fachkonzeptklasse Person
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable
{
    private String spitzname; //Muss
    private String nachname = ""; //Muss
    private String vorname = "", telefon = "", email = "";
    private LocalDate erfasstAm;

    // Standard-Konstruktor
    public Person()
    {
    }

    // weiterer Konstruktor
    public Person(String spitzname, String nachname, String vorname, String telefon, String email)
    {
        this.spitzname = spitzname;
        this.nachname = nachname;
        this.vorname = vorname;
        this.telefon = telefon;
        this.email = email;
        //Datum der Erfassung
        erfasstAm = LocalDate.now();
    }

    public String getSpitzname()
    {
        return spitzname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public String getEmail()
    {
        return email;
    }

    public LocalDate getErfasstAm()
    {
        return erfasstAm;
    }

    public void setSpitzname(String spitzname)
    {
        this.spitzname = spitzname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return this.spitzname.toUpperCase() + " | " +
                this.nachname + " | " +
                this.vorname + " | " +
                this.telefon + " | " +
                this.email;
    }
}
 