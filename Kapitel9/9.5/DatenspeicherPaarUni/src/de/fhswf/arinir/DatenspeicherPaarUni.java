package de.fhswf.arinir;

//Klasse, die Paare gleichen Typs speichert
public class DatenspeicherPaarUni<T> extends DatenspeicherPaar<T, T>
{
    public void setPaar(T neuerWert1, T neuerWert2)
    {
        super.setPaar(neuerWert1, neuerWert2);
    }

    public T getWert1()
    {
        return super.getWert1();
    }

    public T getWert2()
    {
        return super.getWert2();
    }

    public void vertausche()
    {
        super.setPaar(getWert2(), getWert1());
    }
}