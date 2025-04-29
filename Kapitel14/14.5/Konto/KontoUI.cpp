/* Programmname: Konto
 * UI-Klasse: KontoUI
 * Aufgabe: Konten verwalten
 * Eingabe von Beträgen und Kontoart
 * Ausgabe des aktuellen Kontostands
 * Objekte werden statisch angelegt!
 */

#include <iostream>
#include "Sparkonto.h"

using namespace std;

class KontoUI
{
private: // Konten deklarieren
    Konto einKonto;
    Sparkonto einSparkonto;

public:
    // Konstruktor
    KontoUI() : einKonto(1, 0.00), einSparkonto(2, 0.00)
    {

    }
    // Anwendung des Polymorphismus
    // Zur Übersetzungszeit ist nicht bekannt, ob ein Objekt
    // der Klasse Konto oder ein Objekt der Klasse Sparkonto
    // aufgerufen wird
    void einausZahlungenInBar(Konto &einObjekt, double zahlung)
    {
        einObjekt.buchen(zahlung);
    }

    void dialog()
    {
        int funktion;
        double zahl;
        do
        {
            cout << "Funktion waehlen: Kontobetrag (1),Sparkontobetrag(2),Ende(0) : " << endl;
            cin >> funktion;
            switch (funktion)
            {
            case 1:
                cout << "Aktueller Kontostand:"
                     << einKonto.getKontostand() << endl
                     << "Betrag eingeben: ";
                cin >> zahl;
                einausZahlungenInBar(einKonto, zahl);
                cout << "Neuer Kontostand: "
                     << einKonto.getKontostand() << endl;
                break;
            case 2:
                cout << "Aktueller Sparkontostand:"
                     << einSparkonto.getKontostand()
                     << endl
                     << "Betrag eingeben: ";
                cin >> zahl;
                einausZahlungenInBar(einSparkonto, zahl);
                cout << "Neuer Sparkontostand: "
                     << einSparkonto.getKontostand()
                     << endl
                     << endl;
                break;
            case 0:
                break;
            default:
                cout << "Fehlerhafte Eingabe" << endl;
                break;
            }
        } while (!(funktion == 0));
    }
};

// Hauptprogramm
int main()
{
    cout << "Start des Programms Konto" << endl;
    KontoUI einUIObjekt; // Deklarieren eines UI-Objekts
    einUIObjekt.dialog();
    return 0;
};