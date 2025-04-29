package de.fhswf.arinir;

import java.util.List;
import java.util.stream.Collectors;

public class PersonExample
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 40),
                new Person("Charlie", 25)
        );
        var result = people.stream().collect(
                Collectors.teeing(
                        // Anzahl der Personen
                        Collectors.counting(),
                        // Durchschnittsalter
                        Collectors.averagingInt(p -> p.age),
                        (count, avgAge) -> "Anzahl: " + count
                                + ", Durchschnittsalter: " + avgAge
                ));
        System.out.println(result);
    }
}