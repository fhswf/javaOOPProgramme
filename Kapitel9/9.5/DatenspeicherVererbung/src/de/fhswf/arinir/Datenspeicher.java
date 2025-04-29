package de.fhswf.arinir;

public class Datenspeicher<T>
{
    private T wert;

    void setWert(T neuerWert)
    {
        wert = neuerWert;
    }

    T getWert()
    {
        return wert;
    }
}