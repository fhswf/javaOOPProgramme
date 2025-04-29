package de.fhswf.arinir;

public class DatenspeicherMinMaxObject
{
    private Object min, max;

    public void setMax(Object neuerWert)
    {
        max = neuerWert;
    }

    public void setMin(Object neuerWert)
    {
        min = neuerWert;
    }

    public Object getMax()
    {
        return max;
    }

    public Object getMin()
    {
        return min;
    }
}