package de.fhswf.arinir;

/**
 * Programmname: Warteschlange
 * Fachkonzept-Klasse: Warteschlange
 * Aufgabe: Eine Warteschlange
 * mit ArrayList realisieren
 */

import java.util.ArrayList;

class Warteschlange
{
    //Attribute
    private ArrayList<Person> eineListe = new ArrayList<>();

    //Methoden
    boolean bedienen() //Entfernen
    {
        if (eineListe.size() > 0)
        {
            eineListe.remove(0);
            return true;
        } else
            return false;
    }

    void anstellen(Person einePerson) //Einfügen
    {
        eineListe.add(einePerson);
    }

    int getAnzahlElemente()
    {
        return eineListe.size();
    }

    Person getPerson(int index)
    {
        return eineListe.get(index);
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("");
        for (Object obj : eineListe)
        {
            Person person = (Person) obj;
            str = str.append(person.toString() + " ");
        }
        return str.toString();
    }
}