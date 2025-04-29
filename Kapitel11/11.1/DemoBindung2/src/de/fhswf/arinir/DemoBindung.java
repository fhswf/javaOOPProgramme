package de.fhswf.arinir;

import java.util.*;

public class DemoBindung
{
    private static void druckeEinenNamen(String einName)
    {
        System.out.println("Name: " + einName);
        System.out.println("-----------------------");
    }

    private static void druckeAlleNamen
            (ArrayList<String> eineListe)
    {
        System.out.println("+++++ Namensliste +++++");
        System.out.println("-----------------------");
        for (Object element : eineListe)
            druckeEinenNamen((String) element);
        System.out.println("+++ Ende Namensliste ++");
    }

    public static void main(String arg[])
    {
        ArrayList<String> alleNamen = new ArrayList<>();
        alleNamen.add("Meyer");
        alleNamen.add("Schulz");
        alleNamen.add("Balzert");
        alleNamen.add("Dorakov");
        druckeAlleNamen(alleNamen);
    }
}
