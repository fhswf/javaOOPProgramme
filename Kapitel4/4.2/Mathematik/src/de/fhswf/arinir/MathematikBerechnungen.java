package de.fhswf.arinir;

// Datei: MathematikBerechnungen.java
public class MathematikBerechnungen
{
    //@start region=berechneQuadratwurzel

    /**
     * Diese Methode berechnet die Quadratwurzel eines
     * gegebenen Wertes.
     *
     * @param wert Der Wert, dessen Quadratwurzel berechnet
     *             <p>
     *             werden soll.
     * @return Die Quadratwurzel des Wertes.
     */
    public double berechneQuadratwurzel(double wert)
    {
        return Math.sqrt(wert);
    }
    //@end region=berechneQuadratwurzel
    //@start region=piKonstante
    /**
     * Konstante für den Wert von Pi.
     */
    public static final double PI = 3.14159265359;
    //@end region=piKonstante
}