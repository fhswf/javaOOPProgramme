package de.fhswf.arinir;

public class SammlungUI
{
    public static void main(String args[])
    {
        Sammlung eineSammlung = new Sammlung();
        String einElement;
        //Alle Objekte ausgeben
        while (eineSammlung.hasNext())
        {
            einElement = (String) eineSammlung.next();
            System.out.println("Element: " + einElement);
        }
    }
}
