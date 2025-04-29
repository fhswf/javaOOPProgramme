using System;
class EinAusgabe
{
    public static void Main()
    {
        Console.Write("Bitte ganze Zahl eingeben:");
        string zahlAlsString = Console.ReadLine();
        Console.WriteLine("Eingelesene Zahl: " + zahlAlsString);

        int zahl1 = Convert.ToInt32(zahlAlsString);
        int zahl2 = Int32.Parse(zahlAlsString);
        int zahl3 = zahl1 + zahl2;
        Console.WriteLine("Eingelesene Zahl*2: " + zahl3);

        Console.Write("Bitte Gleitkommazahl eingeben: ");
        //Achtung: Die Gleitzahl muss in deutscher Notation
        //mit Kommatrennung erfolgen
        double gleitzahl = Convert.ToDouble(Console.ReadLine());
        gleitzahl = gleitzahl + 1.5;
        Console.WriteLine("Eingelesene Zahl + 1,5 : " +
        gleitzahl.ToString());

        Console.Write("Bitte Namen eingeben: ");
        String name = Console.ReadLine();
        Console.WriteLine("Eingelesener Name: " + name);
        
        //Casting in (char)
        Console.Write("Bitte 1 Zeichen eingeben: ");
        char zeichen = (char)Console.Read();
        Console.Write(" Zeichen: " + zeichen);
    }
}