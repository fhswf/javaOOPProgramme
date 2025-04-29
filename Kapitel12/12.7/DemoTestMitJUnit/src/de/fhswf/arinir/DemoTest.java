package de.fhswf.arinir;

import org.junit.*;

import static org.junit.Assert.*; //statischer Import

public class DemoTest
{
    @Test
    public void testText()
    {
        String text = "Java";
        assertTrue(text.equals("Java"));
    }

    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("de.fhswf.arinir.DemoTest");
    }
}