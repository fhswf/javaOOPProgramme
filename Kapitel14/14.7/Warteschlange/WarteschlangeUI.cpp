/* Programmname: Warteschlange
 * UI-Operation: main-Prozedur
 */
#include <iostream>

using namespace std;

#include "Warteschlange.h"

int main()
{
    cout << "Programm Warteschlange" << endl;
    // Deklaration einer statischen Warteschlange
    // vom Elementtyp int mit der Länge 3
    Warteschlange<int, 3> eineIntWarteschlange;
    // Deklaration einer statischen Warteschlange
    // vom Elementtyp double und der Länge 4
    Warteschlange<double, 4> eineDoubleWarteschlange;
    int IntElement;
    double DoubleElement;
    int funktion;

    do
    {
        cout << "Funktion waehlen: Einf int(1), Entf int(2), ";
        cout << "Einf double(3), Entf double(4), Ende(0)\n";
        cin >> funktion;
        switch (funktion)
        {
        case 1:
            cout << "Int Element:" << endl;
            cin >> IntElement;
            eineIntWarteschlange.einfuegen(IntElement);
            break;
        case 2:
            cout << "Inhalt int: ";
            cout << eineIntWarteschlange.entfernen() << endl;
            break;
        case 3:
            cout << "Double Element: " << endl;
            cin >> DoubleElement;
            eineDoubleWarteschlange.einfuegen(DoubleElement);
            break;
        case 4:
            cout << "Inhalt double: ";
            cout << eineDoubleWarteschlange.entfernen()
                 << endl;
            break;
        default:
            break;
        }
    } while (funktion != 0);
    return 0;
};