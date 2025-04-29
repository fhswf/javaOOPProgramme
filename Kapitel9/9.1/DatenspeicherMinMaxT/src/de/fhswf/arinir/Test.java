package de.fhswf.arinir;

public class Test
{
    public static void main(String args[])
    {
        DatenspeicherMinMax<Double> eineWetterstation = new DatenspeicherMinMax<>();
        eineWetterstation.setMax(new Double(12.67));
        Double dieMaxTemp = eineWetterstation.getMax();
        System.out.println("Temperatur: " + dieMaxTemp);

        DatenspeicherMinMax<Integer> einePegelstation = new DatenspeicherMinMax<>();
        einePegelstation.setMax(new Integer(223));
        Integer derMaxPegel = einePegelstation.getMax();
        System.out.println("Pegel: " + derMaxPegel);

        DatenspeicherMinMax<Character> einText = new DatenspeicherMinMax<>();
        einText.setMin(new Character('c'));
        Character dasMinZeichen = einText.getMin();
        System.out.println("Zeichen: " + dasMinZeichen);

        // Test Autoboxing
        eineWetterstation.setMin(3.76);
        double dieMinTemp = eineWetterstation.getMin();
        System.out.println("Temperatur: " + dieMinTemp);
        einePegelstation.setMax(180);
        derMaxPegel = einePegelstation.getMax();
        System.out.println("Pegel: " + derMaxPegel);

        einText.setMin('x');
        dasMinZeichen = einText.getMin();
        System.out.println("Zeichen: " + dasMinZeichen);
    }
}