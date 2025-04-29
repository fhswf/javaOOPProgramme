/* Programmname: Konto
 * UI-Klasse: KontoUI
 * Aufgabe: Konten verwalten
 * Eingabe von Beträgen und Kontoart
 * Ausgabe des aktuellen Kontostands
 */
using System;
class KontoUI
{
    //Konten deklarieren
    Konto einKonto;
    Sparkonto einSparkonto;

    //Konstruktor
    KontoUI()
    {
        einKonto = new Konto(1, 0.00);
        einSparkonto = new Sparkonto(2, 0.00);
    }

    //Anwendung des Polymorphismus
    //Zur Übersetzungszeit ist nicht bekannt, ob ein Objekt
    //der Klasse Konto oder ein Objekt der Klasse Sparkonto
    //aufgerufen wird
    void einausZahlungenInBar(Konto einObjekt, double zahlung)
    {
        einObjekt.buchen(zahlung);
    }

    void dialog()
	{
		int funktion;
		double zahl;
		do
		{
			Console.WriteLine("Funktion waehlen: Kontobetrag (1), " +
			                  "Sparkontobetrag (2), Ende (0):");
			funktion = Convert.ToInt32(Console.ReadLine());
			switch (funktion)
			{
			case 1:
				Console.WriteLine("Aktueller Kontostand:" + einKonto.getKontostand() + " Betrag eingeben: ");
				zahl = Convert.ToDouble(Console.ReadLine());
				einausZahlungenInBar(einKonto, zahl);
				Console.WriteLine("Neuer Kontostand: " + einKonto.getKontostand());
				break;
			case 2:
				Console.WriteLine("Aktueller Sparkontostand:" + einSparkonto.getKontostand() + " Betrag eingeben: ");
				zahl = Convert.ToDouble(Console.ReadLine());
				einausZahlungenInBar(einSparkonto, zahl);
				Console.WriteLine("Neuer Sparkontostand: " + einSparkonto.getKontostand());
				break;
			case 0:
				break;
			default:
				Console.WriteLine("Fehlerhafte Eingabe");
				break;
			}
		} while (!(funktion == 0));
	}

    //Hauptprogramm
    public static void Main()
    {
        Console.WriteLine("Start des Programms Konto");
        KontoUI einUIObjekt; //Deklarieren eines UI-Objekts
        einUIObjekt = new KontoUI();
        einUIObjekt.dialog();
    }
}