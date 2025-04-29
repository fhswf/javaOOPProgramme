package de.fhswf.arinir;

//Lambda-Ausdrücke in Datenströmen

import java.util.ArrayList;

public class Teilnehmer3
{
    public static void main(String[] args)
    {
        ArrayList<String> teilnehmerliste = new ArrayList<>(5);
        teilnehmerliste.add("Sommer");
        teilnehmerliste.add("Wenzel");
        teilnehmerliste.add("Mustermann");
        teilnehmerliste.add("Borschel");
        teilnehmerliste.add("Zink");

        System.out.println("(1) Namen in Grossbuchstaben");
        teilnehmerliste
                .stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

        System.out.println();
        System.out.println("(2) Namen in Grossbuchstaben mit Methodenreferenz");
        teilnehmerliste
                .stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));

        System.out.println();
        System.out.println("(3) Länge jedes Namens");
        teilnehmerliste
                .stream()
                .map(name -> name.length())
                .forEach(laenge -> System.out.print(laenge + " "));

        System.out.println();
        System.out.println("(4) Alle Namen, die mit Z beginnen");
        teilnehmerliste
                .stream()
                .filter(name -> name.startsWith("Z"))
                .forEach(name -> System.out.print(name + " "));
    }
}