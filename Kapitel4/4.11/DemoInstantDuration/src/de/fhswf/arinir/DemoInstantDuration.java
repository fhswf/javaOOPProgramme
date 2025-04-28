package de.fhswf.arinir;

import java.time.Duration;
import java.time.Instant;

public class DemoInstantDuration
{

    public static void main(String[] args)
    {
        Instant zeitpunktaktuell, zeitpunktplus, zeitpunktminus;
        //Aktuelle Zeit holen
        zeitpunktaktuell = Instant.now();

        //Ausgabe im ISO-8601-Format
        //Datum: JJJJ-MM-TT,
        //Uhrzeit: hh:mm:ss.f (Bruchteile von Sekunden)
        //Zusammen: JJJJ-MM-TTThh:mm:ss.fZ (Zeitzone: Z = UTC)
        System.out.println("Zeitpunkt aktuell: " + zeitpunktaktuell);

        // 10 Stunden und 5 Minuten dazuaddieren
        zeitpunktplus = zeitpunktaktuell.plus(Duration.ofHours(10).plusMinutes(5));
        System.out.println("Zeitpunkt + 10 h + 5 min: " + zeitpunktplus);

        zeitpunktminus = zeitpunktaktuell.minus(Duration.ofDays(5));
        System.out.println("Zeitpunkt- 5 Tage: " + zeitpunktminus);

        System.out.println("ZeitpunktPlus vor Zeitpunktaktuell? " + zeitpunktplus.isAfter(zeitpunktaktuell));

        System.out.println("ZeitpunktMinus nach Zeitpunktaktuell? " + zeitpunktplus.isBefore(zeitpunktaktuell));
    }
}