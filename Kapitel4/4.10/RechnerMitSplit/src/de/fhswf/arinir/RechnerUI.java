package de.fhswf.arinir;

/* Programmname: Taschenrechner
 * UI-Klasse: RechnerUI
 */

import de.fhswf.arinir.inout.Console;

public class RechnerUI
{
    public static void main(String a[])
    {
        Rechner einRechner = new Rechner();
        System.out.println("Bitte Rechenausdruck eingeben" +
                "(mit Leerzeichen trennen): ");
        String eingabe = Console.readString();
        System.out.println("Ergebnis von " + eingabe + " = " +
                einRechner.getErgebnis(eingabe));
    }
}