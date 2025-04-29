/* Programmname: Zaehler
 * Fachkonzept-Klasse: Zaehler
 * Aufgabe: Verwaltung eines Zaehlers
 */
class Zaehler
{
    // Attribute
    // private gilt für alle folgenden Angaben,
    // nach private muss : stehen
private:
    int zaehlerstand;
    // public gilt für alle folgenden Angaben,
    // nach public muss : stehen
public:
    // Konstruktor
    Zaehler() : zaehlerstand(0)
    {
    }
    // Schreibende Operationen
    void setzeAufNull()
    {
        zaehlerstand = 0;
    }
    void erhoeheUmEins()
    {
        zaehlerstand = zaehlerstand + 1;
    }
    // Lesende Operationen
    int gibWert() const
    {
        return zaehlerstand;
    }
}; // Klasse muss mit Semikolon abgeschlossen werden