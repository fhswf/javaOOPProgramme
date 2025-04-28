package de.fhswf.arinir;

public class DemoStringBuilder
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Wie");
        sb.append(" funktioniert");
        sb.append(" Java?");
        String einNeuerString = sb.toString();
        System.out.println(einNeuerString);
    }
}
