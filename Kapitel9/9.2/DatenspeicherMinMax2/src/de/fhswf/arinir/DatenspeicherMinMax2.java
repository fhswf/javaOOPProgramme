package de.fhswf.arinir;

public class DatenspeicherMinMax2<T extends Comparable<T>>
{
    private T min, max;

    public void pruefeMax(T neuerWert)
    {
        if (neuerWert.compareTo(max) > 0)
            max = neuerWert;
    }

    public void pruefeMin(T neuerWert)
    {
        if (neuerWert.compareTo(min) < 0)
            min = neuerWert;
    }

    public void setMax(T neuerWert)
    {
        max = neuerWert;
    }

    public void setMin(T neuerWert)
    {
        min = neuerWert;
    }

    public T getMax()
    {
        return max;
    }

    public T getMin()
    {
        return min;
    }
}
