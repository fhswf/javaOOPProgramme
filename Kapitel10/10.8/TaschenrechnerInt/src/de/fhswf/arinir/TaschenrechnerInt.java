package de.fhswf.arinir;

public class TaschenrechnerInt
{
    @FunctionalInterface
    interface MathInteger
    {
        int berechne(int a, int b);
    }

    public static void main(String args[])
    {
        MathInteger addiere = (c, d) -> c + d;
        MathInteger multipliziere = (x, y) -> x * y;

        System.out.println(addiere.berechne(10, 20));
        System.out.println(multipliziere.berechne(10, 20));
    }
}