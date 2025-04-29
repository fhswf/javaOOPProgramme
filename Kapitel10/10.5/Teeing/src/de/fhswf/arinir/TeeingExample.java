package de.fhswf.arinir;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        var result = numbers.stream().collect(
                Collectors.teeing(
                        // Summe
                        Collectors.summingInt(Integer::intValue),
                        // Durchschnitt
                        Collectors.averagingDouble(Integer::doubleValue),
                        // Kombination
                        (sum, avg) -> "Summe: " + sum
                                + ", Durchschnitt: " + avg
                ));
        System.out.println(result);
    }
}