package de.fhswf.arinir;

import java.io.*;
import java.beans.*;

public class DemoXMLSerialisierung
{
    public static void main(String[] args)
    {
        //Bei der Benutzung von BlueJ nötig
        Thread.currentThread().setContextClassLoader(DemoXMLSerialisierung.class.getClassLoader());
        Person einePerson = new Person("Mustermann", "Harald", 38);
        String filename = "Beispiel.xml";
        // Serialisieren
        try (XMLEncoder enc = new XMLEncoder(new FileOutputStream(filename)))

        {
            enc.writeObject(einePerson);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // Deserialisieren
        try (XMLDecoder dec = new XMLDecoder(new FileInputStream(filename)))
        {
            Person wiedereinePerson = (Person) dec.readObject();
            System.out.println(wiedereinePerson.getName() + ", "
                    + wiedereinePerson.getVorname() + ", Alter: "
                    + wiedereinePerson.getAlter());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}