package de.fhswf.arinir;

public class KundeUI
{
    public static void main(String arg[])
    {
        //Aufruf des Konstruktors
        Kunde einKunde = new Kunde();
        //Aufrufe von Objektoperationen
        einKunde.setName("Helga Hasselbusch");
        Anzeige merkeAdresse = einKunde.erzeugeAnzeige("Gut erhaltener Gartentisch", 2000);
        //Speicheradresse merken
        einKunde.setLinkAnzeige(merkeAdresse);
        String kundenname = einKunde.getName();

        //Speicheradresse lesen
        Anzeige adresseAnzeige = einKunde.getLinkAnzeige();
        System.out.println("Kunde " + kundenname +
                " hat die Anzeige\n\"" + adresseAnzeige.getTitel() +
                "\" aufgegeben");
    }
}