package de.fhswf.arinir;

public class DatenspeicherMinMaxdouble
{
    private double min, max;

    public void setMax(double neueTemperatur)
    {
        max = neueTemperatur;
    }

    public void setMin(double neueTemperatur)
    {
        min = neueTemperatur;
    }

    public double getMax()
    {
        return max;
    }

    public double getMin()
    {
        return min;
    }
}