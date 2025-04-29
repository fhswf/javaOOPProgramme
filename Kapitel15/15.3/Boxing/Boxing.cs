using System;
class Boxing
{
    public static void Main()
    {
        int eineZahl = 101;
        object einObjekt = eineZahl;
        //Auto Boxing von eineZahl in einObjekt
        Console.WriteLine("Wert von einObjekt: " + einObjekt);
        int zweiteZahl = (int) einObjekt;
        //Explizites Unboxing zurück in int
        Console.WriteLine("Wert von zweiteZahl: " + zweiteZahl);
    }
}