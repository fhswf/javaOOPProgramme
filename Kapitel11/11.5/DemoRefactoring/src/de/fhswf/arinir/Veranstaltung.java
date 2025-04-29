package de.fhswf.arinir;

import java.time.LocalDate;

public abstract class Veranstaltung
{
    private int nummer;
    private short dauer;
    private LocalDate vom, bis;
    private String ort, adresse;
    private short teilnehmerMax;
    private boolean storniert = false;
}
