/* Programmname: Artikelverwaltung
* Fachkonzept-Klasse: Artikel
* Aufgabe: Einsatz von Klassenattributen und-operationen
*/
using System;
class Artikel
{
    //Klassenattribut deklarieren
    static int anzahlArtikel = 0;
    int artikelNr;
    int lagermenge;
    // Konstruktor
    public Artikel(int artikelnr, int anfangsbestand)
    {
        this.artikelNr = artikelnr;
        this.lagermenge = anfangsbestand;
        anzahlArtikel = AnzahlArtikel + 1;
    }

    // Klassenoperation
    static int AnzahlArtikel
    {
        get { return anzahlArtikel; }
    }

    // Objektoperationen
    int anzeigenLagermenge(int artikelNr)
    {
        return lagermenge;
    }

    void aendernBestand(int artikelNr, int bestandsaenderung)
    {
        lagermenge = lagermenge + bestandsaenderung;
    }

    public static void Main()
    {
        Console.WriteLine("Programm Artikelverwaltung");

        int funktion, artikelNr, menge;
        Artikel einArtikel;
        do
        {
            Console.Write("AnzahlArtikel: ");
            //Klassenoperation
            Console.WriteLine(Artikel.AnzahlArtikel);

            Console.WriteLine("Funktion waehlen: "
                              + "Anlegen (1), Bestand aendern (2), Ende (0)");
            funktion = Convert.ToInt32(Console.ReadLine());
            switch (funktion)
            {

                case 1:
                    Console.WriteLine("Artikelnr: ");
                    artikelNr = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Anfangsbestand: ");
                    menge = Convert.ToInt32(Console.ReadLine());
                    einArtikel = new Artikel(artikelNr, menge);
                    break;
                case 2:
                    break;
                case 0:
                    break;
            }
        } while (funktion != 0);
    }
}