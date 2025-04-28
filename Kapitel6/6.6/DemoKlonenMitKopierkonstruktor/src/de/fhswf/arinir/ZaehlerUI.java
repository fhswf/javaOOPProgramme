package de.fhswf.arinir;

public class ZaehlerUI
{
    public static void main(String args[])
    {
        //Attribute
        Zaehler einZaehler, klonZaehler = null;
        Verbraucher einVerbraucher = new Verbraucher("Schulz");
        einZaehler = new Zaehler("Elektro", einVerbraucher, 123);
        //Klonen

        //klonZaehler = einZaehler.clone(); altes Vorgehen
        klonZaehler = new Zaehler(einZaehler);

        System.out.println
                ("Zählerstand = "
                        + einZaehler.getZaehlerstand()
                        + " gehört zu Verbraucher " +
                        einZaehler.getMeinVerbraucher().getName());
        System.out.println
                ("Geklonter Zähler: Zählerstand = "
                        + klonZaehler.getZaehlerstand()
                        + " gehört zu Verbraucher " +
                        klonZaehler.getMeinVerbraucher().getName());
        if (einZaehler.getMeinVerbraucher() == klonZaehler.getMeinVerbraucher())
            System.out.println("Verbraucher identisch");
        else
            System.out.println("Verbraucher nicht identisch");
        //----------------------------------------------
        Unterzaehler nochEinZaehler = new Unterzaehler("Gas", einVerbraucher, 500);
        System.out.println
                ("Zählerstand = "
                        + nochEinZaehler.getZaehlerstand() +
                        " Unterzählerstand: "
                        + nochEinZaehler.getUnterzaehlerstand()
                        + " gehört zu Verbraucher " +
                        nochEinZaehler.getMeinVerbraucher().getName());
        //Klonen
        Unterzaehler klonUnterzaehler = null;

        klonUnterzaehler = new Unterzaehler(nochEinZaehler);

        System.out.println
                ("GeklonterUnterzähler: Zählerstand = "
                        + klonUnterzaehler.getZaehlerstand() +
                        " Unterzählerstand: "
                        + klonUnterzaehler.getUnterzaehlerstand()
                        + " gehört zu Verbraucher "
                        + klonUnterzaehler.getMeinVerbraucher().getName());
    }
}