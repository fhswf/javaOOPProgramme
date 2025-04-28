package de.fhswf.arinir;
// Datei: Hauptprogramm.java

/**
 * Dieses Programm demonstriert die Verwendung der
 * Klasse MathematikBerechnungen.
 * <p>
 * {@snippet class = "de.fhswf.arinir.MathematikBerechnungen"
 *
 *region = "berechneQuadratwurzel"}
 * <p>
 * {@snippet class = "de.fhswf.arinir.MathematikBerechnungen"
 *
 *region = "piKonstante"}
 */
public class Hauptprogramm
{

    public static void main(String[] args)
    {
        MathematikBerechnungen berechnungen =
                new MathematikBerechnungen();
        double ergebnis = berechnungen.berechneQuadratwurzel(16);
        System.out.println("Die Quadratwurzel von 16 ist: " + ergebnis);
        System.out.println("Der Wert von Pi ist: " + MathematikBerechnungen.PI);
    }
}