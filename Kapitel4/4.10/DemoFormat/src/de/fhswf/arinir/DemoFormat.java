package de.fhswf.arinir;

public class DemoFormat
{
    public static void main(String args[])
    {
        String t = "ein Text";
        int eineGanzzahl = 123;
        double eineGleitpunktzahl = 123456.789;
        double nocheineGleitpunktzahl = -98765.4321;
        String s = String.format("Dies ist %S und dies eine ganze Zahl %d", t, eineGanzzahl);
        String s2 = String.format("Gleitpunktzahl: %f %nund halblogarithmisch: %e", eineGleitpunktzahl, eineGleitpunktzahl);
        System.out.println(s);
        System.out.println(s2);
        String s3 = String.format("Gleitpunktzahl: %2$f %nund halblogarithmisch: %1$e", eineGleitpunktzahl, nocheineGleitpunktzahl);
        System.out.println(s3);
        String s4 = String.format("Doppelt: %1$d- %1$S", eineGanzzahl);
        System.out.println(s4);
    }
}