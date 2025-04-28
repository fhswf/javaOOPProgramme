package de.fhswf.arinir;

//Erzeugen der Beziehungen

import java.util.*;

public class ArtikelLieferantUI
{
    public static void main(String args[])
    {
        Artikel ersterArtikel = new Artikel(10);
        Lieferant lieferant1, lieferant2, lieferant3;
        lieferant1 = new Lieferant("A");
        lieferant2 = new Lieferant("B");
        lieferant3 = new Lieferant("C");
        ersterArtikel.setLinkAnbieter(lieferant3);
        ersterArtikel.setLinkAnbieter(lieferant1);
        //Navigieren
        System.out.println("Alle Lieferanten des Artikels 10:");
        druckeLieferanten(ersterArtikel);
    }

    private static void druckeLieferanten(Artikel einArtikel)
    {
        Lieferant einLieferant;
        ArrayList<Lieferant> alleLieferanten = einArtikel.gibAlleAnbieter();
        for (int i = 0; i < alleLieferanten.size(); i++)
        {
            einLieferant = alleLieferanten.get(i);
            System.out.println(einLieferant.getName());
        }

    }
}