package de.fhswf.arinir;

public class TaschenrechnerInt2
{
    @FunctionalInterface
    interface MathInteger
    {
        int berechne(int a, int b);
    }

    public static int ergebnis(int x, int y, MathInteger op)
    {
        return op.berechne(x, y);
    }

    public static void main(String args[])
    {
        int c = 10, d = 20;
        System.out.println(ergebnis(c, d, (c1, d1) -> c1 - d1));
        System.out.println(ergebnis(c, d, (c1, d1) -> d1 / c1));
    }
}