package de.fhswf.arinir;

import java.util.*;

public class DemoScannerTab
{
    public static void main(String args[])
    {
        String einKundensatz = "Helmut\tBalzert\tBochum";
        System.out.println(einKundensatz);
        Scanner einScanner = new Scanner(einKundensatz).useDelimiter("\\t");
        String vorname = einScanner.next();
        String name = einScanner.next();
        String ort = einScanner.next();
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + name);
        System.out.println("Ort: " + ort);
    }
}