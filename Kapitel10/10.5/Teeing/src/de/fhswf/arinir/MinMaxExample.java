package de.fhswf.arinir;

import java.util.List;
import java.util.stream.Collectors;

public class MinMaxExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(3, 7, 2, 8, 6);
        var result = numbers.stream().collect(
                Collectors.teeing(
                        // Minimum
                        Collectors.minBy(Integer::compare),
                        // Maximum
                        Collectors.maxBy(Integer::compare),
                        // Kombination
                        (min, max) -> "Min: " + min.orElse(null)
                                + ", Max: " + max.orElse(null)
                ));
        System.out.println(result);
    }
}