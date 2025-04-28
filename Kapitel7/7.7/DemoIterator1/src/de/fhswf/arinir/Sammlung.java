package de.fhswf.arinir;

import java.util.*;

public class Sammlung implements Iterator, Iterable
{
    String einKundensatz = "Helmut\tBalzert\tBochum";
    Scanner einScanner = new Scanner(einKundensatz).useDelimiter("\\t");

    //Implementierung der Schnittstelle Iterator
    public boolean hasNext()
    {
        return einScanner.hasNext();
    }

    public Object next()
    {
        return einScanner.next();
    }

    public void remove() throws UnsupportedOperationException
    {
    }

    //Implementierung der Schnittstelle Iterable
    public Iterator iterator()
    {
        return this;
    }
}
