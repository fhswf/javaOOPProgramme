// Beispiel für den Einsatz der Parameterarten ref und out
using System;
public class Tausche
{
    static void tausche(ref int zahl1, ref int zahl2, out int summe)
    {
        int merke = zahl1;
        zahl1 = zahl2;
        zahl2 = merke;
        summe = zahl1 + zahl2;
    }

    public static void Main()
    {
        Console.WriteLine("erste Zahl: ");
        int ersteZahl = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("zweite Zahl: ");
        int zweiteZahl = Convert.ToInt32(Console.ReadLine());
        int ergebnis;

        tausche(ref ersteZahl, ref zweiteZahl, out ergebnis);
        
        Console.WriteLine("neue erste Zahl: " + ersteZahl);
        Console.WriteLine("neue zweite Zahl: " + zweiteZahl);
        Console.WriteLine("Summe: " + ergebnis);
    }
}