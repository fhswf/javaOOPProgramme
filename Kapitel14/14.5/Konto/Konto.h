/* Programmname: Konto (Schnittstelle)
 * Fachkonzept-Klasse: Konto
 * Aufgabe: konkrete Oberklasse Konto
 * Dateiname: Konto.h
 */

class Konto
{
protected:
    int kontonr;
    double kontostand;

public:
    // Konstruktor
    Konto(int nummer, double ersteZahlung);
    // Schreibende Operationen
    virtual void buchen(double betrag);
    // Lesende Operationen
    double getKontostand() const;
};