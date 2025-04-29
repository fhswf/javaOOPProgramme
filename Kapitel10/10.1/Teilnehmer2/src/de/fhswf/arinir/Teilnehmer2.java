package de.fhswf.arinir;

/**
 * Demonstration des Unterschieds zwischen
 * imperativen und deklarativem Programmieren
 * Beispiel in Java 8
 * Durchlaufen einer Liste
 */

import java.util.ArrayList;
import java.util.function.Consumer;

public class Teilnehmer2
{
    public static void main(String[] args)
    {
        ArrayList<String> teilnehmerliste = new ArrayList<>(5);
        teilnehmerliste.add("Sommer");
        teilnehmerliste.add("Wenzel");
        teilnehmerliste.add("Mustermann");
        teilnehmerliste.add("Borschel");
        teilnehmerliste.add("Zink");

        System.out.println("(1) Teilnehmerliste klassisch");
        for (int i = 0; i < teilnehmerliste.size(); i++)
        {
            System.out.println(teilnehmerliste.get(i));
        }

        System.out.println("(2) Teilnehmerliste mit erweiterter for-Schleife");
        for (String name : teilnehmerliste)
        {
            System.out.println(name);
        }

        System.out.println("(3) Teilnehmerliste mit forEach aus Java 8");
        //Anonyme innere Klasse mit internem Iterator
        teilnehmerliste.forEach(new Consumer<String>()
                                        //anonyme Klasse implementiert Schnittstelle Consumer
                                {
                                    //Methode der anonymen Klasse
                                    public void accept(String name)
                                    {
                                        System.out.println(name);
                                    }
                                } //Ende der anonymen Klasse
        ); //Ende des Methodenaufrufs forEach

        System.out.println("(4) Lambda-Ausdruck ersetzt innere Klasse");
        teilnehmerliste.forEach((String name) -> System.out.println(name));

        System.out.println("(5) Lambda-Ausdruck ohne Typangabe");
        //wird automatisch vom Compiler kontextabhängig ergänzt
        teilnehmerliste.forEach((name) -> System.out.println(name));

        System.out.println("(6) Lambda-Ausdruck mit einem Parameter");
        //Klammer um Parameter kann entfallen
        teilnehmerliste.forEach(name -> System.out.println(name));

        System.out.println("(7) Rumpf ersetzt durch Methodenreferenz");
        teilnehmerliste.forEach(System.out::println);
    }
}