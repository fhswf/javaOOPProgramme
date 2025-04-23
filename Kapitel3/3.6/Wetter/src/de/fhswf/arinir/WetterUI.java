package de.fhswf.arinir;

public class WetterUI
{
    public static void main(String args[])
    {
        Wetter ersteStation = new Wetter("Ort A");
        Wetter zweiteStation = new Wetter("Ort B");
        ersteStation.setTemperatur(23);
        zweiteStation.setTemperatur(23);
        vergleicheTemperatur(ersteStation, zweiteStation);
    }

    private static void vergleicheTemperatur(Wetter station1, Wetter station2)
    {
        System.out.print("Die Temperatur zwischen " + station1.getStation() + " und "
                + station2.getStation() + " ist ");
        if (station1.getTemperatur() == station2.getTemperatur())
            System.out.println("gleich");
        else
            System.out.println("ungleich");
    }
}