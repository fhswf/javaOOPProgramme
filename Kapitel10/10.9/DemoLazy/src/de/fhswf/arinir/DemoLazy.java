package de.fhswf.arinir;

//Lazy Evaluation von Operationen

import java.util.ArrayList;

public class DemoLazy
{
    private static int gibLaenge(final String name)
    {
        System.out.println("Namenslänge ermitteln von " + name);
        return name.length();
    }

    private static String wandleInGross(final String name)
    {
        System.out.println("Umwandeln in Großbuchstaben: " + name);
        return name.toUpperCase();
    }

    public static void main(String[] args)
    {
        ArrayList<String> namen = new ArrayList<>(12);
        namen.add("Anne");
        namen.add("Maria");
        namen.add("Mia");
        namen.add("Susanne");
        namen.add("Amy");
        namen.add("Linda");
        namen.add("Sophie");
        namen.add("Bettina");
        namen.add("Britta");
        namen.add("Jasmin");
        namen.add("Inge");
        namen.add("Ida");

        String ersterVornameMit3Buchstaben =
                namen.stream()
                        .filter(name -> gibLaenge(name) == 3)
                        .map(name -> wandleInGross(name))
                        .findFirst()
                        .get();
        System.out.println("Erster Vorname mit 3 Buchstaben: " + ersterVornameMit3Buchstaben);
    }
}