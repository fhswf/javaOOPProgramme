package de.fhswf.arinir;

public class KundeUI
{

    public static void main(String args[])
    {
        //Aufrufe einer Klassenoperation
        Kunde.setKundenanzahl(0);

        //Aufruf des Konstruktors
        Kunde einKunde = new Kunde("Helga Hasselbusch", "0234/66453",
                43070024, 12577883);
        System.out.println("Kundenanzahl: " + Kunde.getKundenanzahl());
        //Aufrufe von Objektoperationen
        String kundenname = einKunde.getName();
        String telefonnr = einKunde.getTelefon();
        System.out.println("Kunde " + kundenname + " hat die Telefonnr. " + telefonnr);
    }
}
