package de.fhswf.arinir;

class AnzeigeUI
{
    public static void main(String arg[])
    {
        //Aufrufe von Klassenoperationen
        Anzeige.setMwstvoll(19);
        Anzeige.setGrundpreis(200); //Eurocent
        Anzeige.setPreisfaktor(3); //Eurocent
        //Aufruf des Konstruktors
        Anzeige eineAnzeige = new Anzeige("Gut erhaltener Gartentisch");
        //Aufrufe von Objektoperationen
        eineAnzeige.setRubrik("Garten");
        eineAnzeige.setBeschreibung("Gartentisch, weiss, Plastik, sehr stabil, 160 x 110 cm");
        eineAnzeige.setPreis(2000);
        System.out.println("Die Anzeige \""
                + eineAnzeige.getTitel() + "\" kostet "
                + (double) (eineAnzeige.berechneAnzeigenpreis() / 100.0)
                + " " + '\u20AC');
    }
}
