package de.fhswf.arinir;

public class KundeUI
{

    public static void main(String args[])
    {
        //Aufrufe einer Klassenoperation
        Kunde.setKundenanzahl(0);

        //Aufruf des Konstruktors
        Kunde einKunde = new Kunde();
        System.out.println("Kundenanzahl: " + Kunde.getKundenanzahl());
        //Aufrufe von Objektoperationen
        einKunde.setName("Helga Hasselbusch");
        einKunde.setTelefon("0234/66-453");
        String kundenname = einKunde.getName();
        String telefonnr = einKunde.getTelefon();
        System.out.println("Kunde " + kundenname + " hat die Telefonnr. " + telefonnr);
    }
}
