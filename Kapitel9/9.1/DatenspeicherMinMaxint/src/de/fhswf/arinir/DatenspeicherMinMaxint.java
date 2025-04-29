package de.fhswf.arinir;

public class DatenspeicherMinMaxint
{
    private int min, max;

    public void setMax(int neuerWert)
    {
        max = neuerWert;
    }

    public void setMin(int neuerWert)
    {
        min = neuerWert;
    }

    public int getMax()
    {
        return max;
    }

    int getMin()
    {
        return min;
    }
}