package de.fhswf.arinir;

public class DatenspeicherMinMax2<T>
{
    private T min, max;

    public void pruefeMax(T neuerWert)
    {
        if (neuerWert > max)
            max = neuerWert;
    }

    public void pruefeMin(T neuerWert)
    {
        if (neuerWert < min)
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