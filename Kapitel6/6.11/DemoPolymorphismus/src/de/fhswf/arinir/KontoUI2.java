package de.fhswf.arinir;

public class KontoUI2
{
    static final int istKonto = 0;
    static final int istSparkonto = 1;
    static Konto einKonto;
    static Sparkonto einSparkonto;

    public static void main(String args[])
    {
        einKonto = new Konto(1, 1000);
        einSparkonto = new Sparkonto(5, 500);
        einzahlen(2000, 0);
        einzahlen(700, 1);
    }

    static void einzahlen(int betrag, int kontoart)
    {
        switch (kontoart)
        {
            case istKonto:
                einKonto.buchen(betrag);
                System.out.println("Das Konto mit der Nr. " +
                        einKonto.getKontonr() + " hat den Kontostand " +
                        einKonto.getKontostand());
                break;
            case istSparkonto:
                einSparkonto.buchenSparkonto(betrag);
                System.out.println("Das Konto mit der Nr. " +
                        einSparkonto.getKontonr() + " hat den Kontostand " +
                        einSparkonto.getKontostand());
                break;
        }
    }
}