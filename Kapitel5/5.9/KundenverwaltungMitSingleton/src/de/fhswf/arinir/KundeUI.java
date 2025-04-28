package de.fhswf.arinir;

import java.util.*;

public class KundeUI
{
    public static void main(String args[])
    {
        KundenContainer meinContainer = KundenContainer.getObjektreferenz();
        Kunde einKunde = new Kunde("Köster");
        //Erzeugtes Objekt im Kundencontainer
        //verwalten
        meinContainer.insertKunde(einKunde);
        einKunde = new Kunde("Siebert");
        meinContainer.insertKunde(einKunde);
        einKunde = new Kunde("Kühn");
        meinContainer.insertKunde(einKunde);
        //Kundenliste ausgeben
        druckeKundenliste(meinContainer);
    }

    static void druckeKundenliste(KundenContainer einContainer)
    {
        Kunde einKunde;
        ArrayList<Kunde> meineKunden = einContainer.alleKunden();
        for (Kunde k : meineKunden)
            System.out.println(k.getName());
    }
}