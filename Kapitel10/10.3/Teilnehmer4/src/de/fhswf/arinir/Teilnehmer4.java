package de.fhswf.arinir;

/**
 * Lambda-Ausdrücke in Datenströmen
 * Terminal Operations
 */

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Optional;

public class Teilnehmer4
{
    public static void main(String[] args)
    {
        ArrayList<String> teilnehmerliste = new ArrayList<>(5);
        teilnehmerliste.add("Sommer");
        teilnehmerliste.add("Wenzel");
        teilnehmerliste.add("Mustermann");
        teilnehmerliste.add("Borschel");
        teilnehmerliste.add("Zink");
        System.out.println("(1) Längster Name?");
        Optional<String> laengsterName =
                teilnehmerliste
                        .stream()
                        .reduce((name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        laengsterName.ifPresent(name ->
                System.out.println("Der längste Name ist: " + name));
        System.out.println();
        System.out.println("(2) Summe der Länge aller Namen: " +
                teilnehmerliste
                        .stream()
                        .mapToInt(name -> name.length())
                        .sum()
        );
        System.out.println();
        System.out.println(
                "(3) Durchschnittliche Länge aller Namen: " +
                        teilnehmerliste
                                .stream()
                                .mapToInt(name -> name.length())
                                .average()
        );
    }
}