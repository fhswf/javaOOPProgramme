/* Programmname: Konto
 * Fachkonzept-Klasse: Sparkonto
 * Aufgabe: Sparkonten dürfen nicht negativ werden
 * Dateiname: Sparkonto.cpp
 */
#include "Sparkonto.h"
// Konstruktor
Sparkonto::Sparkonto(int nummer, double ersteZahlung) : Konto(nummer, ersteZahlung)
{
}

// Redefinierte Operation
void Sparkonto::buchen(double betrag)
{
    if (getKontostand() + betrag >= 0)
        // Operation buchen der Oberklasse aufrufen
        Konto::buchen(betrag);
}