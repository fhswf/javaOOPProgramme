package de.fhswf.arinir;

public class KundeUI
{
    public static void main(String arg[])
    {
        Kunde einKunde = new Kunde();
        einKunde.setName("Helga Hasselbusch");
        einKunde.setTelefon("0234/66-453");
        String kundenname = einKunde.getName();
        String telefonnr = einKunde.getTelefon();
        System.out.println("Kunde " + kundenname + " hat die \nTelefonnr. " + telefonnr);
    }
}
