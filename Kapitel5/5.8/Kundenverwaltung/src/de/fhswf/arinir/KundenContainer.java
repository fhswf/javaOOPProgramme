package de.fhswf.arinir;

import java.util.*;

public class KundenContainer
{
    private ArrayList<Kunde> meineKunden = new ArrayList<>();

    public void insertKunde(Kunde einKunde)
    {
        meineKunden.add(einKunde);
    }

    public ArrayList<Kunde> gibAlleKunden()
    {
        return meineKunden;
    }
}