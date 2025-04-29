package de.fhswf.arinir;

import org.junit.*;

import static org.junit.Assert.*; //statischer Import

public class DemoTest
{
    String einText;

    @Before
    public void setUp()
    {
        einText = " ist toll!";
    }

    @Test
    public void testText()
    {
        String text = "Java" + einText;
        assertTrue(text.equals("Java ist toll!"));
    }

    @Test
    public void testText2()
    {
        String text = "HTML5" + einText;
        assertTrue(text.equals("HTML5 ist toll!"));
    }

    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("de.fhswf.arinir.DemoTest");
    }
}