package de.fhswf.arinir;

public class MitarbeiterUI
{
    public static void main(String args[])
    {
        Mitarbeiter mitarbeiterAlt = //1
                new Mitarbeiter("Guido", "Baumann", "Frankfurt");
        Mitarbeiter mitarbeiterGeklont = //2
                new Mitarbeiter(mitarbeiterAlt);
        System.out.println("Neuer Mitarbeiter: " +
                mitarbeiterGeklont.getNachname() + " " +
                mitarbeiterGeklont.getAdresse());
    }
}
