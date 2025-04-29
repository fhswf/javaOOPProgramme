package de.fhswf.arinir;

public class Datenspeicher<T>
{
    private T Wert;

    public void setWert(T neuerWert)
    {
        Wert = neuerWert;
    }

    public T getWert()
    {
        return Wert;
    }
}