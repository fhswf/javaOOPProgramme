package de.fhswf.arinir;

import org.junit.*;

import static org.junit.Assert.*;

public class KontoTest
{
    private Konto einKonto;

    @Before
    public void setUp()
    {
        einKonto = new Konto(0, 1);
    }

    @Test
    public void kontoAnlegen() throws Exception
    {
        Konto einKonto = new Konto(0, 1);
        assertTrue(1 == einKonto.getKontostand());
    }

    @Test
    public void testBuchen()
    {
        try
        {
            einKonto.buchen(-10000);
            assertTrue(-9999 == einKonto.getKontostand());
        }
        catch (Exception e)
        {
        }
    }

    @Test(expected = Exception.class)
    public void testBuchenFehler1() throws Exception
    {
        einKonto.buchen(-10001);
    }

    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("de.fhswf.arinir.KontoTest");
    }
}