package de.fhswf.arinir;

import de.fhswf.arinir.inout.Console;

public class PasswortUI
{
    private final static int MIN_LAENGE_PASSWORT = 6;

    public static boolean pruefePasswortLaenge(String passwort)
    {
        if (passwort.length() < MIN_LAENGE_PASSWORT)
        {
            System.out.println("Ihr Passwort hat weniger als " + MIN_LAENGE_PASSWORT + " Zeichen");
            return false;
        }
        return true;
    }

    public static boolean pruefePasswortHatZiffer(String passwort)
    {
        for (int i = 0; i < passwort.length(); i++)
        {
            if (Character.isDigit(passwort.charAt(i)))
                return true;
        }//Ende for
        System.out.println("Ihr Passwort hat keine Ziffer");
        return false;
    }

    public static boolean pruefePasswortPolitik(String passwort)
    {
        if (pruefePasswortLaenge(passwort) && pruefePasswortHatZiffer(passwort))
            return true;
        return false;
    }

    public static void main(String args[])
    {
        System.out.println("Wählen Sie ein Passwort (mindestens 6 Zeichen"
                        + " und 1 Ziffer)");
        String passwort = Console.readString();

        boolean freigabe = pruefePasswortPolitik(passwort);
        if (freigabe)
            System.out.println("Ihr Passwort " + passwort + " entspricht unseren Vorgaben");
        //....
    }
}