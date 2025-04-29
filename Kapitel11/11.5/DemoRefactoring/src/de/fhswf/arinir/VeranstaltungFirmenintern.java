package de.fhswf.arinir;

import java.time.LocalDate;

public class VeranstaltungFirmenintern
{
    private int nummer;
    private short dauer;
    private LocalDate vom, bis;
    private String ort, adresse;
    private short teilnehmerMax;
    private double pauschalpreis;
    private boolean storniert = false;
}