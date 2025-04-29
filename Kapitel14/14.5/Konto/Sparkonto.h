/* Programmname: Konto (Schnittstelle)
 * Fachkonzept-Klasse: Sparkonto
 * Aufgabe: Sparkonten dürfen nicht negativ werden
 * Dateiname: Sparkonto.h
 */
#include "Konto.h"

class Sparkonto : public Konto
{
public:
    // Konstruktor
    Sparkonto(int nummer, double ersteZahlung);
    // Redefinierte Operation
    virtual void buchen(double betrag);
};
