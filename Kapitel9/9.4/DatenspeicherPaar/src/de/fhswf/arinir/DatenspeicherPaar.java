package de.fhswf.arinir;

class DatenspeicherPaar<T1, T2>
{
    private T1 wert1;
    private T2 wert2;

    public void setPaar(T1 neuerWert1, T2 neuerWert2)
    {
        wert1 = neuerWert1;
        wert2 = neuerWert2;
    }

    public T1 getWert1()
    {
        return wert1;
    }

    public T2 getWert2()
    {
        return wert2;
    }
}