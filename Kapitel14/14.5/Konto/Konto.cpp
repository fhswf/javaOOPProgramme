/* Programmname: Konto
 * Fachkonzept-Klasse: Konto
 * Aufgabe: konkrete Oberklasse Konto
 * Dateiname: Konto.cpp
 */
#include "Konto.h"

Konto::Konto(int nummer, double ersteZahlung) : // Initialisierungsliste
                                                kontonr(nummer), kontostand(ersteZahlung)
{
}

// Schreibende Operationen
void Konto::buchen(double betrag)
{
    kontostand = kontostand + betrag;
}

// Lesende Operationen
double Konto::getKontostand() const
{
    return kontostand;
}