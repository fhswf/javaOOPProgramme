package de.fhswf.arinir;

public class Test
{
    public static void main(String args[])
    {
        DatenspeicherMinMax2<Float> eineWetterstation = new DatenspeicherMinMax2<>();
        // Test Autoboxing
        eineWetterstation.setMin(2.76f);
        eineWetterstation.pruefeMin(3.76f);

        float dieMinTemp = eineWetterstation.getMin();
        System.out.println("Temperatur: " + dieMinTemp);
    }
}