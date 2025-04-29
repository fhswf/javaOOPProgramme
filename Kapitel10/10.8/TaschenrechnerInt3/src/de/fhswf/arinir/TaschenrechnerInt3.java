package de.fhswf.arinir;

public class TaschenrechnerInt3 implements MathInteger
{
    public static void main(String args[])
    {
        System.out.println(MathInteger.berechneStatisch(10, 20));
        TaschenrechnerInt3 meinRechner = new TaschenrechnerInt3();
        long x = meinRechner.berechneLong(100000, 200000);
        System.out.println(x);
    }

    @Override
    public int berechne(int a, int b)
    {
        return a + b;
    }
}
