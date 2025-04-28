package de.fhswf.arinir;

/**
 * Fachkonzept-Klasse: Person
 * Aufgabe: Klasse, die angibt, welche Daten in der Warteschlange
 * verwaltet werden sollen
 */
class Person
{
    private String name;

    Person(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }
}
