package de.fhswf.arinir;
/**
 * Container zum Verwalten von Aufgaben, Kontaktpersonen
 * und Mitarbeitern
 */

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjektContainer
{
    // Attribute
    private Datenbasis basis;
    private ObjektDatei eineObjektDatei;

    //Verknuepfung von UI-Eingaben (char) und Fachkonzept (Prioritaet, Status, Kategorie)
    private static final Map<Character, Prioritaet> enumPrioritaet =
            new HashMap<Character, Prioritaet>()
            {{
                put('a', Prioritaet.A);
                put('b', Prioritaet.B);
                put('c', Prioritaet.C);
            }};
    private static final Map<Character, Status> enumStatus =
            new HashMap<Character, Status>()
            {{
                put('i', Status.InBearbeitung);
                put('w', Status.WartenAufAnderen);
                put('z', Status.Zurueckgestellt);
                put('e', Status.Erledigt);
                put('n', Status.NichtBegonnen);
            }};
    private static final Map<Character, Kategorie> enumKategorie =
            new HashMap<Character, Kategorie>()
            {{
                put('p', Kategorie.Privat);
                put('b', Kategorie.Beruf);
            }};
    private static final Map<Character, Aufgabensortierung> enumAufgabensortierung =
            new HashMap<Character, Aufgabensortierung>()
            {{
                put('t', Aufgabensortierung.Endetermin);
                put('a', Aufgabensortierung.Prioritaet);
                put('b', Aufgabensortierung.Beruflich);
                put('p', Aufgabensortierung.Privat);
                put('s', Aufgabensortierung.Status);
            }};

    // Singleton-Muster
    private static ObjektContainer einObjektContainer = null;

    // Konstruktor -private!
    private ObjektContainer()
    {
        // fuer BlueJ
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());

        // Gespeicherte Daten einlesen
        // Falls noch keine Daten gespeichert wurden, kann keine Datei gelesen werden
        // In dem Fall wird eine Meldung ausgegeben
        eineObjektDatei = new ObjektDatei("Datenbasis.ser");
        try
        {
            basis = (Datenbasis) eineObjektDatei.leseObjekt();
        }
        catch (Exception e)
        {
            System.out.println("Keine Datenbasis zum Auslesen vorhanden");
        }

        if (basis == null)
        {
            System.out.println("Es wurde eine neue Datenbasis angelegt");
            basis = new Datenbasis();
        }
    }

    // Klassen-Operation, die die Objektreferenz liefert
    // Wenn Objekt noch nicht vorhanden, dann wird es erzeugt
    public static ObjektContainer getObjektreferenz()
    {
        if (einObjektContainer == null)
            einObjektContainer = new ObjektContainer();
        return einObjektContainer;
    }

    public void einfuegeAufgabe(String stichwort, String beschreibung,
                                LocalDate fertigAm, Character prioritaet, Character kategorie,
                                Character status, Person kontaktperson)
    {
        //Prioritaet, Kategorie, Status keine Pflichteingaben, daher null moeglich
        //Wenn im Konstruktor null uebergeben wird, dann werden die Standardwerte genutzt
        Prioritaet p = null;
        if (prioritaet != null)
            p = enumPrioritaet.get(prioritaet);
        Kategorie k = null;
        if (kategorie != null)
            k = enumKategorie.get(kategorie);
        Status s = null;
        if (status != null)
            s = enumStatus.get(status);
        Aufgabe eineAufgabe = new Aufgabe(stichwort, beschreibung, fertigAm, p, k, s, kontaktperson);
        basis.getMeineAufgaben().add(eineAufgabe);// hinten anfügen
    }

    public void einfuegePerson(String spitzname, String nachname, String vorname,
                               String telefon, String email, String abteilung)
    {
        Person einePerson = null;
        //Wenn abteilung einen Wert enthaelt (!=null - leerer String moeglich), dann ist es ein Mitarbeiter
        if (abteilung == null)
            einePerson = new Person(spitzname, nachname, vorname, telefon, email);
        else
            einePerson = new Mitarbeiter(spitzname, nachname, vorname, telefon, email, abteilung);
        basis.getMeinePersonen().add(einePerson);// hinten anfügen

        //Standard: nach Spitzname sortieren (keine andere Sortierung angeboten)
        //Nur beim Einfuegen muss sortiert werden, da nur in diesem Fall die Liste geaendert wird
        Collections.sort(basis.getMeinePersonen(),
                (Person p1, Person p2) -> (p1.getSpitzname().compareTo(p2.getSpitzname())));
    }

    public Iterator<Aufgabe> iteratorAufgaben(Character aufgabensortierung)
    {
        //Bei der Ausgabe muss festgelegt werden, welche Sortierung genutzt werden soll
        //bei null wird nach "Endetermin" sortiert
        Comparator<Aufgabe> einComparator;
        if (aufgabensortierung == null)
        {
            //Standard ist nach Termin sortieren
            einComparator = Aufgabe.enumAufgabensortierung.get(Aufgabensortierung.Endetermin);
        }
        else
        {
            einComparator = Aufgabe.enumAufgabensortierung.get(enumAufgabensortierung.get(aufgabensortierung));
        }
        Collections.sort(basis.getMeineAufgaben(), einComparator);
        return basis.getMeineAufgaben().iterator();
    }

    public Iterator<Person> iteratorPersonen()
    {
        return basis.getMeinePersonen().iterator();
    }

    public Iterator<Person> iteratorMitarbeiter()
    {
        try
        {
            //p instanceof Mitarbeiter == false ist notwendig,
            //da lediglich alle Person-Objekte gesucht werden
            //Da Mitarbeiter auch Personen sind, wuerden diese Objekte
            //nicht gefiltert
            return basis.getMeinePersonen()
                    .stream()
                    .filter(p -> p instanceof Mitarbeiter == false).iterator();
        }
        catch (NoSuchElementException ne)
        {
            return null;
        }
    }

    public Aufgabe gibAufgabe(String stichwort)
    {
        try
        {
            return basis.getMeineAufgaben()
                    .stream()
                    .filter(a -> a.getStichwort().equalsIgnoreCase(stichwort))
                    .findFirst()
                    .get();
        }
        catch (NoSuchElementException ne)
        {
            return null;
        }
    }

    public Person gibPerson(String spitzname)
    {
        try
        {
            //p instanceof Mitarbeiter == false ist notwendig,
            //da lediglich alle Person-Objekte gesucht werden
            //Da Mitarbeiter auch Personen sind, wuerden diese Objekte
            //nicht gefiltert
            return basis.getMeinePersonen()
                    .stream()
                    .filter(p -> p instanceof Mitarbeiter == false)
                    .filter(p -> p.getSpitzname().equalsIgnoreCase(spitzname))
                    .findFirst()
                    .get();
        }
        catch (NoSuchElementException ne)
        {
            return null;
        }
    }

    public Mitarbeiter gibMitarbeiter(String spitzname)
    {
        try
        {
            return (Mitarbeiter) basis.getMeinePersonen()
                    .stream()
                    .filter(p -> p instanceof Mitarbeiter)
                    .filter(p -> p.getSpitzname().equalsIgnoreCase(spitzname))
                    .findFirst()
                    .get();
        }
        catch (NoSuchElementException ne)
        {
            return null;
        }
    }

    // Methode zum Speichern der Daten ------------------
    public void endeAnwendung()
    {
        eineObjektDatei.speichereObjekt(basis);
        System.out.println("Datenbasis wurde gespeichert");
    }
}