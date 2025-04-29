package de.fhswf.arinir;

//Beispiel für das generische Sortieren
//mit verschiedenen Sortierkriterien

import java.util.*;

class DemoSortMehrfach
{
    public static void main(String args[])
    {
        System.out.println("Sortieren von Freunden");

        ArrayList<Freund> eineListe = new ArrayList<>();
        eineListe.add(new Freund("Meyer", "Hans", 42));
        eineListe.add(new Freund("Schulz", "Joe", 27));
        eineListe.add(new Freund("Bohn", "Helga", 17));
        eineListe.add(new Freund("Dorakov", "Johanna", 66));

        System.out.println("--- Sortierkriterum Nachname---");
        Collections.sort(eineListe);
        for (Freund element : eineListe)
            System.out.println(element.getNachname() + " " + element.getVorname() + " " + element.getAlter());

        System.out.println("--- Sortierkriterium Vorname---");
        Collections.sort(eineListe, Freund.vornameComparator);
        for (Freund element : eineListe)
            System.out.println(element.getVorname() + " " + ((Freund) element).getNachname() + " " + ((Freund) element).getAlter());

        System.out.println("--- Sortierkriterium Alter---");
        Collections.sort(eineListe, Freund.alterComparator);
        for (Freund element : eineListe)
            System.out.println(element.getAlter() + " " + element.getNachname() + " " + element.getVorname());
    }
}