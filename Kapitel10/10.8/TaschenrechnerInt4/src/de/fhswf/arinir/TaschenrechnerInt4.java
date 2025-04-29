package de.fhswf.arinir;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class TaschenrechnerInt4
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

        IntFunction quadriere = e -> e * e;
        System.out.println(quadriere.apply(9));

        IntPredicate geradeZahl = f -> f % 2 == 0 ? true : false;
        System.out.println(geradeZahl.test(8));
    }
}