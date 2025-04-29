package de.fhswf.arinir;

//Beispiel für das generische Sortieren durch Einfügen

import java.util.*;

public class DemoSortGenerisch
{
    public static <E extends Comparable<E>> void sortieren(ArrayList<E> liste)
    {
        int i, j;
        E merke;
        for (i = 1; i < liste.size(); i++)
        { //Element herausgreifen
            merke = liste.get(i);
            //Platz schaffen / neuen Platz suchen
            for (j = i - 1; j >= 0 && merke.compareTo(liste.get(j)) < 0; j--)
                liste.set(j + 1, liste.get(j));
            //Einfügen des Elements
            liste.set(j + 1, merke);
        }
    }

    public static void main(String args[])
    {
        System.out.println("Sortieren von Zeichenketten");
        ArrayList<String> eineStringListe = new ArrayList<>();
        eineStringListe.add("Meyer");
        eineStringListe.add("Schulz");
        eineStringListe.add("Balzert");
        eineStringListe.add("Dorakov");
        DemoSortGenerisch.sortieren(eineStringListe); //Aufruf
        for (String element : eineStringListe)
            System.out.println(element);

        System.out.println("Sortieren von Zahlen");
        ArrayList<Integer> eineIntegerListe = new ArrayList<>();
        eineIntegerListe.add(10);
        eineIntegerListe.add(50);
        eineIntegerListe.add(30);
        eineIntegerListe.add(1);
        DemoSortGenerisch.sortieren(eineIntegerListe);
        for (Integer element : eineIntegerListe)
            System.out.println(element);
        System.out.println("Sortieren von Namen");
        System.out.println("Sortierkriterum Nachname");
        ArrayList<Freund> eineFreundListe = new ArrayList<>();
        eineFreundListe.add(new Freund("Meyer", "Hans"));
        eineFreundListe.add(new Freund("Schulz", "Joe"));
        eineFreundListe.add(new Freund("Balzert", "Helmut"));
        eineFreundListe.add(new Freund("Dorakov", "Johanna"));
        DemoSortGenerisch.sortieren(eineFreundListe);
        for (Freund element : eineFreundListe)
            System.out.println(element.getVorname() + " " + element.getNachname());

        System.out.println("Sortieren mit Collections.sort");
        Collections.sort(eineFreundListe);
        for (Freund element : eineFreundListe)
            System.out.println(element.getVorname() + " " + element.getNachname());
    }
}