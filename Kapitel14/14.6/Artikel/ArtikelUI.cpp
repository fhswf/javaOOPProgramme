/* Programmname: Artikelverwaltung
 * UI-Operation: main-Prozedur (Ausschnitt)
 */
#include <iostream>
#include "Artikel.h"

using namespace std;

int main()
{
    cout << "Programm Artikelverwaltung" << endl;
    int funktion, artikelNr, menge;
    Artikel *einArtikel; // Zeiger
    do
    {
        cout << "AnzahlArtikel: ";

        cout << Artikel::anzeigenAnzahlArtikel();
        // Klassenoperation
        cout << endl;
        cout << "Funktion waehlen: Anlegen (1), Bestand aendern(2),Ende(0) " << endl;
        cin >>
            funktion;
        switch (funktion)
        {
        case 1:
            cout << "Artikelnr: " << endl;
            cin >> artikelNr;
            cout << "Anfangsbestand: " << endl;
            cin >> menge;
            einArtikel = new Artikel(artikelNr, menge);
            break;
        case 2:
            break;
        case 0:
            break;
        }
    } while (funktion != 0);
    return 0;
};