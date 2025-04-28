package de.fhswf.arinir;

//Container zum Verwalten von Kunden und Anzeigen

import java.util.*;

public class ObjektContainer
{
    //Attribute
    private Datenbasis basis;
    private ObjektDatei eineObjektDatei;
    //Singleton-Muster
    private static ObjektContainer einObjektContainer = null;

    //Konstruktor-private!
    private ObjektContainer()
    {
        //Gespeicherte Daten einlesen
        //Falls noch keine Daten gespeichert wurden, kann keine
        //Datei gelesen werden, es gibt dann eine Ausnahme
        eineObjektDatei = new ObjektDatei("Datenbasis.xml");
        basis = (Datenbasis) eineObjektDatei.leseObjekt();
        if (basis == null)
        {
            System.out.println("Es wurde eine neue Datenbasis angelegt");
            basis = new Datenbasis();
        }
    }

    //Klassen-Operation, die die Objektreferenz liefert
    //Wenn Objekt noch nicht vorhanden, dann wird es erzeugt
    public static ObjektContainer getObjektreferenz()
    {
        if (einObjektContainer == null)
        {
            einObjektContainer = new ObjektContainer();
        }
        return einObjektContainer;
    }

    //Methoden für Kunden------------------------------
    public void einfuegeKunde(Kunde einKunde)
    {
        basis.getMeineKunden().add(einKunde);
    }

    public Kunde gibKunde(int kundennr)
    {
        for (int i = 0; i < basis.getMeineKunden().size(); i++)
        {
            Kunde kunde = basis.getMeineKunden().get(i);
            if (kunde.getKundennr() == kundennr)
                return kunde;
        }
        return null;
    }

    public Iterator iteratorKunden()
    {
        return basis.getMeineKunden().iterator();
    }

    //Methoden für Anzeigen------------------------------
    public void einfuegeAnzeige(Anzeige eineAnzeige)
    {
        basis.getMeineAnzeigen().add(eineAnzeige);

    }

    public Anzeige gibAnzeige(int anzeigennr)
    {
        for (int i = 0; i < basis.getMeineAnzeigen().size(); i++)
        {
            Anzeige anzeige = basis.getMeineAnzeigen().get(i);
            if (anzeige.getAnzeigennr() == anzeigennr)
                return anzeige;
        }
        return null;
    }

    public Iterator iteratorAnzeigen()
    {
        return basis.getMeineAnzeigen().iterator();
    }

    //Operation zum Speichern der Daten------------------
    public void endeAnwendung()
    {
        System.out.println("ObjektContainer: endeAnwendung");
        eineObjektDatei.speichereObjekt(basis);
    }
}
