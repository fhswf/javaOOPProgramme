/* Programmname: Zaehler
* Aufgabe: Verwaltung eines Zaehlers
*/
using System;
class Zaehler
{
    private int zaehlerstand;

    Zaehler()
    {
        zaehlerstand = 0;
    }

    //accessors
    public int Zaehlerstand //neuer Bezeichner
    {
        get { return zaehlerstand; }
        set { zaehlerstand = value; }//value = impliziter Parameter
    }

    public static void Main()
    {
        Zaehler einZaehler = new Zaehler();
        Console.WriteLine("Zaehlerstand: " + einZaehler.Zaehlerstand);
        einZaehler.Zaehlerstand = 5; //Wertübergabe durch Zuweisung
        Console.WriteLine("Zaehlerstand: " + einZaehler.Zaehlerstand);
    }
}