package de.fhswf.arinir;

/* Programmname: Objektspeicherung
 * Datenhaltungs-Klasse: ObjektDatei
 * Aufgabe: Ein Objekt in einen Byte-Strom serialisieren.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjektDatei
{
    private String einDateiname;

    public ObjektDatei(String einDateiname)
    {
        this.einDateiname = einDateiname;
    }

    public void speichereObjekt(Object einObjekt)
    {
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(einDateiname)))
        {
            writer.writeObject(einObjekt);

        }
        catch (Exception ex)
        {
            System.out.println("Fehler in speichereObjekt: " + ex);
        }
    }

    public Object leseObjekt()
    {
        Object einObject = null;
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(einDateiname)))
        {
            einObject = reader.readObject();
        }
        catch (Exception ex)
        {
            System.out.println("Fehler in leseObjekt: " + ex);
        }

        return einObject;
    }
}