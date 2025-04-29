/* Programmname: Artikelverwaltung
 * Fachkonzept-Klasse: Artikel (Implementierung)
 * Aufgabe: Einsatz von Klassenattributen und-operationen
 */

#include "Artikel.h"

// Klassenattribut definieren und initialisieren
int Artikel::anzahlArtikel = 0;

// Konstruktor
Artikel::Artikel(int artikelnr, int anfangsbestand)
{
    artikelNr = artikelnr;
    lagermenge = anfangsbestand;
    anzahlArtikel = anzahlArtikel + 1;
}

// Klassenoperation
int Artikel::anzeigenAnzahlArtikel()
{
    return anzahlArtikel;
}

// Objektoperationen
int Artikel::anzeigenLagermenge(int artikelNr)
{
    return lagermenge;
}

void Artikel::aendernBestand(int artikelNr,
                             int bestandsaenderung)
{
    lagermenge = lagermenge + bestandsaenderung;
};