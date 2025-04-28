package de.fhswf.arinir;

import java.util.Iterator;

public class DemoIteratorAmpel implements Iterator, Iterable
{
    private int rot = 0, gelb = 1, gruen = 2, ausserBetrieb = 3;
    private int ampelwert = 0, betriebszaehler = 0;

    public boolean hasNext()
    {
        betriebszaehler++;
        if (betriebszaehler < 10)
            return true;
        else return false;
    }

    public Object next()
    {
        return (ampelwert++) % 4;
    }

    public void remove() throws UnsupportedOperationException
    {
    }

    public Iterator iterator()
    {
        return this;
    }
}