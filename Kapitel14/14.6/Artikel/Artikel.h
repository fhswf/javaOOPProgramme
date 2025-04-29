/* Programmname: Artikelverwaltung
 * Fachkonzept-Klasse: Artikel (Schnittstelle)
 * Aufgabe: Einsatz von Klassenattributen und-operationen
 */

class Artikel
{
private:
    static int anzahlArtikel; // Klassenattribut deklarieren
    int artikelNr;            // Objektattribute
    int lagermenge;

public:
    // Konstruktor
    Artikel(int artikelNr, int anfangsbestand);
    // Klassenoperation
    static int anzeigenAnzahlArtikel();
    // Objektoperationen
    int anzeigenLagermenge(int artikelNr);
    void aendernBestand(int artikelNr, int bestandsaenderung);
};