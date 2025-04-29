package de.fhswf.arinir;

// Fachkonzept-Klasse: Sparkonto
public class Sparkonto extends Konto
{
    //manuelle Instrumentierung
    private static int[] durchlaufSpar = {0, 0};

    // Konstruktor
    public Sparkonto(int kontonr, int ersteZahlung) throws Exception
    {
        //Anwendung des Konstruktors der Oberklasse
        super(kontonr, ersteZahlung);
    }

    //Redefinierte Methode
    @Override
    public void buchen(int betrag) throws Exception
    {
        if (getKontostand() + betrag >= 0)
        {
            durchlaufSpar[0]++;
            System.out.println("Zweig 0 Sparkonto: " + durchlaufSpar[0]);
            super.buchen(betrag);
            //Methode buchen der Oberklasse aufrufen
        }
        else
        {
            durchlaufSpar[1]++;
            System.out.println("Zweig 1 Sparkonto: " + durchlaufSpar[1]);
            throw new Exception("Kontostand darf nicht negativ werden!" + " Buchung wurde nicht ausgeführt");
        }
    }

    //Überdeckung ausgeben
    public static int[] getDurchlauf()
    {
        return durchlaufSpar;
    }
}