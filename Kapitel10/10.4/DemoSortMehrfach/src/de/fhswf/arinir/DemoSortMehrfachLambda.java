package de.fhswf.arinir;

//Beispiel für das Sortieren mit Lambda-Ausdrücken

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

class DemoSortMehrfachLambda
{
    public static void main(String args[])
    {
        ArrayList<Freund> eineListe = new ArrayList<Freund>();
        eineListe.add(new Freund("Meyer", "Hans", 42));
        eineListe.add(new Freund("Schulz", "Joe", 27));
        eineListe.add(new Freund("Bohn", "Helga", 17));
        eineListe.add(new Freund("Dorakov", "Johanna", 66));
        eineListe.add(new Freund("Müller", "Dirk", 27));

        //Version (1) mit Lambda-Ausdruck
        List<Freund> aufsteigendesAlter = eineListe
                .stream()
                .sorted((freund1, freund2)
                        -> freund1.alterUnterschied(freund2))
                .collect(toList());

        druckeFreunde("Sortierung nach aufsteigendem Alter:", aufsteigendesAlter);

        //Version (2) mit Methodenreferenz
        aufsteigendesAlter = eineListe
                .stream()
                .sorted(Freund::alterUnterschied)
                .collect(toList());

        druckeFreunde("Sortierung nach aufsteigendem Alter:", aufsteigendesAlter);

        //Version (3) Absteigendes Alter- Vertauschen der Parameter
        aufsteigendesAlter = eineListe
                .stream()
                .sorted((freund1, freund2)
                        -> freund2.alterUnterschied(freund1))
                .collect(toList());

        druckeFreunde("Sortierung nach absteigendem Alter:", aufsteigendesAlter);

        //Version (4)- Absteigendes Alter mit reverse()
        Comparator<Freund> aufsteigendAlter = (freund1, freund2) -> freund1.alterUnterschied(freund2);
        Comparator<Freund> absteigendAlter = aufsteigendAlter.reversed();
        aufsteigendesAlter = eineListe.stream().sorted(absteigendAlter).collect(toList());

        druckeFreunde("Sortierung nach absteigendem Alter:", aufsteigendesAlter);

        //Version (5)- Sortierung nach aufsteigenden Nachnamen
        List<Freund> aufsteigendNachnamen = eineListe
                .stream()
                .sorted((freund1, freund2)
                        -> freund1.getNachname().compareTo(freund2.getNachname()))
                .collect(toList());

        druckeFreunde("Sortierung nach aufsteigendem Nachnamen:", aufsteigendNachnamen);

        //Version (6)- Mit funktionaler Schnittstelle
        final Function<Freund, String> nachName = freund -> freund.getNachname();

        aufsteigendNachnamen = eineListe
                .stream()
                .sorted(comparing(nachName))
                .collect(toList());

        druckeFreunde("Sortierung nach aufsteigendem Nachnamen:", aufsteigendNachnamen);

        //Version (7) Sortierung zuerst nach Alter, dann nach Nachn.
        final Function<Freund, Integer> nachAlter = freund -> freund.getAlter();

        druckeFreunde("Sortierung aufsteigend zuerst nach Alter, " + "dann nach Nachnamen: ",
                eineListe
                        .stream()
                        .sorted(comparing(nachAlter)
                                .thenComparing(nachName))
                        .collect(toList()));
    }

    private static void druckeFreunde(String titel, List<Freund> freunde)
    {
        System.out.println(titel);
        freunde.forEach(System.out::println);
    }
}