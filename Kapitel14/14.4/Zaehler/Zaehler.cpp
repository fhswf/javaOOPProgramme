/* Programmname: Zaehler(Implementierung)
 * Aufgabe: Verwaltung eines Zaehlers
 * Fachkonzept-Klasse: Zaehler
 * Dateiname: Zaehler.cpp
 */

#include "Zaehler.h"

// Konstruktor
Zaehler::Zaehler() : zaehlerstand(0)
{
}

// Schreibende Operationen
void Zaehler::setzeAufNull()
{
    zaehlerstand = 0;
}

void Zaehler::erhoeheUmEins()
{
    zaehlerstand = zaehlerstand + 1;
}

// Lesende Operationen
int Zaehler::gibWert() const
{
    return zaehlerstand;
}