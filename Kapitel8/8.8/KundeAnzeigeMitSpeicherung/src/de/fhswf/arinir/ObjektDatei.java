package de.fhswf.arinir;

/* Programmname: Objektspeicherung
 * Datenhaltungs-Klasse: ObjektDatei
 * Aufgabe: Eine Objekt nach und von
 * XML serialisieren.
 */

import java.io.*;
import java.beans.*;

public class ObjektDatei
{
    private String einDateiname;

    //Konstruktor
    public ObjektDatei(String einDateiname)
    {
        this.einDateiname = einDateiname;
    }

    //Methoden
    public void speichereObjekt(Object einObjekt)
    {
        try (XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(einDateiname))))
        {
            enc.writeObject(einObjekt);
        }
        catch (IOException ioe)
        {
            System.out.println("Fehler in speichereObjekt: " + ioe);
        }
    }

    public Object leseObjekt()
    {
        Object einObject = null;
        try (XMLDecoder denc = new XMLDecoder(new BufferedInputStream(new FileInputStream(einDateiname))))
        {
            einObject = denc.readObject();
        }
        catch (IOException ioe)
        {
            System.out.println("Fehler in leseObjekt: " + ioe);
        }
        return einObject;
    }
}