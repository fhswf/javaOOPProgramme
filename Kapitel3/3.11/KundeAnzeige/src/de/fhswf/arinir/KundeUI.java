package de.fhswf.arinir;

public class KundeUI
{
    public static void main(String arg[])
    {
        //Aufruf des Konstruktors
        Kunde einKunde = new Kunde();
        //Aufrufe von Objektoperationen
        einKunde.setName("Helga Hasselbusch");
        Anzeige eineAnzeige = einKunde.erzeugeAnzeige("Gut erhaltener Gartentisch", 2000);
        String kundenname = einKunde.getName();
        System.out.println("Kunde " + kundenname +
                " hat die Anzeige\n\"" +
                eineAnzeige.getTitel() +
                "\" aufgegeben");
    }
}
