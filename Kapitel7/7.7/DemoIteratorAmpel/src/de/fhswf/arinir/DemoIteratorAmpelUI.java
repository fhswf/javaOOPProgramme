package de.fhswf.arinir;

public class DemoIteratorAmpelUI
{
    public static void main(String args[])
    {
        DemoIteratorAmpel eineAmpel = new DemoIteratorAmpel();
        while (eineAmpel.hasNext())
        {
            switch ((Integer) (eineAmpel.next()))
            {
                case 0:
                    System.out.println("Ampel = rot");
                    break;
                case 1:
                    System.out.println("Ampel = gelb");
                    break;
                case 2:
                    System.out.println("Ampel = gruen");
                    break;
                case 3:
                    System.out.println("Ampel = außer Betrieb");
                    break;
                default:
                    System.out.println("Fehler");
            }
        }
        System.out.println("Ausgabe über Schnittstelle Iterable");
        DemoIteratorAmpel nocheineAmpel = new DemoIteratorAmpel();
        Integer einElement;
        for (Object o : nocheineAmpel)
        {
            einElement = (Integer) o;
            System.out.println("Ampelwert = " + einElement);
        }
    }
}