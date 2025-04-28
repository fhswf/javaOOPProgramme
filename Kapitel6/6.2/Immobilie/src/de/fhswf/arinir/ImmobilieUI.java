package de.fhswf.arinir;

public class ImmobilieUI
{
    public static void main(String args[])
    {
        Einfamilienhaus einHaus = new Einfamilienhaus("Köster", 300000, "Stadthaus");
        Geschaeftshaus nocheinHaus = new Geschaeftshaus("Möller", 1500000, 10);
        System.out.println("Daten zum Einfamilienhaus");
        System.out.println("Haustyp: " + einHaus.getHaustyp());
        System.out.println("Besitzer: " + einHaus.getBesitzer());
        System.out.println("Verkaufspreis: " + einHaus.getVerkaufspreis());

        System.out.println("Daten zum Geschäftshaus");
        System.out.println("Anzahl Büroräume: " + nocheinHaus.getAnzahlBueroraeume());
        System.out.println("Besitzer: " + nocheinHaus.besitzer);
        //Zugriff möglich, da im selben Paket
        System.out.println("Verkaufspreis: " + nocheinHaus.getVerkaufspreis());
    }
}