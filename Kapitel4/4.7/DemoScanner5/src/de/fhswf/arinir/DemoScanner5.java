package de.fhswf.arinir;

import java.util.*;

public class DemoScanner5
{
    public static void main(String args[])
    {
        int i;
        double d;
        boolean b;
        String s;
        String in = "Beispiel 1 Scanner true 123,12 567.89 Java false";
        Scanner sc = new Scanner(in);
        // Read to end.
        while (sc.hasNext())
        {
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                System.out.println("int: " + i);
            }
            else if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                System.out.println("double: " + d);
            }
            else if (sc.hasNextBoolean())
            {
                b = sc.nextBoolean();
                System.out.println("boolean: " + b);
            }
            else
            {
                s = sc.next();
                System.out.println("String: " + s);
            }
        }
    }
}