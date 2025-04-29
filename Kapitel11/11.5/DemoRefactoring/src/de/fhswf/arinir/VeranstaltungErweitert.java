package de.fhswf.arinir;

import java.time.LocalDate;

public class VeranstaltungErweitert
{
    private int nummer;
    private short dauer;
    private LocalDate vom, bis;
    private String ort, adresse;
    private short teilnehmerMax;
    private double pauschalpreis; //nur wenn firmenintern
    private boolean storniert = false;
    private short teilnehmerMin; //nur wenn öffentlich
    private short teilnehmerAktuell; //nur wenn öffentlich
    private double stornogebuehr; //nur wenn öffentlich
}