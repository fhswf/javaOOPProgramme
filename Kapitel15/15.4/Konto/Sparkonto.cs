/* Programmname: Konto und Sparkonto
* Fachkonzept-Klasse: Sparkonto
* Aufgabe: Verwalten von Sparkonten
* Restriktion: Sparkonten dürfen nicht negativ werden
*/
public class Sparkonto : Konto
{
    // Konstruktor
    public Sparkonto(int kontonr, double ersteZahlung):
        base(kontonr, 0.0)
    {
        buchen(ersteZahlung);
    }
    
    //Redefinierte Operation
    public override void buchen(double Betrag)
    {
        //geerbte Operation getKontostand der Oberklasse
        if (getKontostand() + Betrag >= 0)
            base.buchen(Betrag);
        //Operation buchen der Oberklasse aufrufen
    }
}