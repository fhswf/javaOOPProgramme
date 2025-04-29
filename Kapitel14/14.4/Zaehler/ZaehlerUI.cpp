/* Programmname: Zaehler
 * UI-Klasse: ZaehlerUI
 * Aufgabe: Verwaltung eines Zaehlers
 * Verwendung statischer Objekte
 */
#include <iostream>
#include "Zaehler.h"

using namespace std;

class ZaehlerUI
{
private:
    Zaehler einKmZaehler; // Deklaration eines statischen Objekts

public:
    // Konstruktor
    ZaehlerUI() {}

    // Operationen
    void anzeigen()
    {
        cout << "KM-Stand: " << einKmZaehler.gibWert();
        // Punktnotation
        cout << endl;
    }

    void dialog()
    {
        int funktion;
        do
        {
            cout << "Funktion waehlen: Erhoehen (1),Auf Null setzen (2), Ende (0):";
            cout << endl;
            cin >> funktion;
            switch (funktion)
            {
            case 1:
                einKmZaehler.erhoeheUmEins();
                // Punktnotation
                anzeigen();
                break;
            case 2:
                einKmZaehler.setzeAufNull();
                // Punktnotation
                anzeigen();
                break;
            case 0:
                break;
            default:
                cout << "Fehlerhafte Eingabe";
                cout
                    << endl;
                break;
            }
        } while (funktion != 0);
    }
};

// Hauptprogramm
int main()
{
    cout << "Start des Programms Zaehler";
    cout << endl;
    // Erzeugen eines UI-Objekts
    ZaehlerUI einUIObjekt;
    // Deklaration und Erzeugen eines UI-Objekts
    einUIObjekt.dialog();
    
    return 0;
};