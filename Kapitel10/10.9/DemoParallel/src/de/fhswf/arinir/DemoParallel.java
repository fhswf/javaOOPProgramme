package de.fhswf.arinir;

//Sequenzielle vs. parallele Berechnung

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class DemoParallel
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        double uGrenze = -30.0, oGrenze = +40.0;
        //Bereiche der Zufallszahlen
        //Liste mit 10 Mio. Daten erzeugen
        List<Double> d = Stream.generate(
                        () -> new Double(uGrenze + (Math.random() *
                                (oGrenze - uGrenze + 1))))
                .limit(10_000_000).collect(Collectors.toList());
        List<Double> temp =
                d.stream()
                        .parallel()
                        .sorted()
                        .filter(wert -> (Math.abs(wert) > 25.0))
                        .collect(Collectors.toList());
        long stop = System.currentTimeMillis();
        System.out.println("Verbrauchte Zeit in ms: " + (stop - start));
    }
}