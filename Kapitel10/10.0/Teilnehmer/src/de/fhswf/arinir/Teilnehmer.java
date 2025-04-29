package de.fhswf.arinir;

/**
 * Demonstration des Unterschieds zwischen
 * imperativen und deklarativem Programmieren
 * Beispiel in Java 7
 */

import java.util.ArrayList;

public class Teilnehmer
{
    public static void findeTeilnehmerImperativ(ArrayList<String> teilnehmerliste)
    {
        boolean teilgenommen = false;
        for (String teilnehmer : teilnehmerliste)
        {
            if (teilnehmer.equals("Mustermann"))
            {
                teilgenommen = true;
                break;
            }
        }
        System.out.println("Mustermann hat teilgenommen? " + teilgenommen);
    }

    public static void findTeilnehmerDeklarativ(ArrayList<String> teilnehmerliste)
    {
        System.out.println("Mustermann hat teilgenommen? " + teilnehmerliste.contains("Mustermann"));
    }

    public static void main(String[] args)
    {
        ArrayList<String> teilnehmerliste = new ArrayList<>(5);
        teilnehmerliste.add("Sommer");
        teilnehmerliste.add("Wenzel");
        teilnehmerliste.add("Mustermann");
        teilnehmerliste.add("Borschel");
        teilnehmerliste.add("Zink");
        findeTeilnehmerImperativ(teilnehmerliste);
        findTeilnehmerDeklarativ(teilnehmerliste);
    }
}
