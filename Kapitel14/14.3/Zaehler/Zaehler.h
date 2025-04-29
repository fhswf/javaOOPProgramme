/* Programmname: Zaehler (Schnittstelle)
 * Fachkonzept-Klasse: Zaehler
 * Aufgabe: Verwaltung eines Zaehlers
 * Dateiname: Zaehler.h
 */
class Zaehler
{
private:
    int zaehlerstand;
    
public:
    // Konstruktor
    Zaehler();
    // Schreibende Operationen
    void setzeAufNull();
    void erhoeheUmEins();
    // Lesende Operationen
    int gibWert() const;
};