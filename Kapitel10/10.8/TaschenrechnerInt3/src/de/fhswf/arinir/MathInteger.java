package de.fhswf.arinir;

@FunctionalInterface
interface MathInteger
{
    int berechne(int a, int b);

    default long berechneLong(int a, int b)
    {
        return (long) a * (long) b;
    }

    static double berechneStatisch(int a, int b)
    {
        return (double) a / (double) b;
    }
}
