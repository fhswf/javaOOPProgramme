/* Programmname: Konto
 * UI-Klasse: KontoUI
 * Aufgabe: Konten verwalten
 * Eingabe von Beträgen und Kontoart
 * Ausgabe des aktuellen Kontostands
 */
public class Konto
{
    //Attribute
    protected int kontonr;
    protected double kontostand;

    // Konstruktor
    public Konto(int kontonr, double ersteZahlung)
    {
        this.kontonr = kontonr;
        kontostand = ersteZahlung;
    }

    //Schreibende Operationen
    public virtual void buchen(double betrag)
    {
        kontostand = kontostand + betrag;
    }

    //Lesende Operationen
    public double getKontostand()
    {
        return kontostand;
    }
}