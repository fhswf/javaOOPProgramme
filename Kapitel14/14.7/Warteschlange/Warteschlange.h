/* Programmname: Warteschlange
 * Fachkonzept-Klasse: Warteschlange (Schnittstelle)
 * Einsatz einer generischen Klasse
 * Parameter T: Platzhalter für den Typ
 * der zu speichernden Elemente
 * Parameter int max: Länge max der Warteschlange
 */

#include <iostream>

using namespace std;

template <class T, int max = 10>
class Warteschlange
{
private:
    int anfang; // hier wird entfernt
    int ende;   // hier wird angefuegt
    T einFeld[max];

public:
    // Konstruktor
    Warteschlange() : anfang(0), ende(0)
    {
    }

    void einfuegen(const T &Element)
    {
        if (anfang == (ende + 1) % (max + 1))
            cout << "Mitteilung: Schlange voll" << endl;
        else
        {
            einFeld[ende] = Element;
            ende = (ende + 1) % (max + 1);
        }
    }

    T entfernen()
    {
        T Element;
        if (anfang == ende)
        {
            cout << "Mitteilung: Schlange leer" << endl;
            return einFeld[0];
        }
        else
        {
            Element = einFeld[anfang];
            anfang = (anfang + 1) % (max + 1);
            return Element;
        }
    }
};