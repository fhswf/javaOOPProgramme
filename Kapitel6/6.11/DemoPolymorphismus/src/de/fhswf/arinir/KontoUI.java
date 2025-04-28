package de.fhswf.arinir;

public class KontoUI
{
    public static void main(String args[])
    {
        Konto einKonto = new Konto(1, 1000);
        Sparkonto einSparkonto = new Sparkonto(5, 500);
        einzahlen(einKonto, 2000);
        einzahlen(einSparkonto, 700);
    }

    private static void einzahlen(Konto einObjekt, int betrag)
    {
        einObjekt.buchen(betrag);
        System.out.println("Das Konto mit der Nr. " +
                einObjekt.getKontonr() + " hat den Kontostand " +
                einObjekt.getKontostand());
    }
}