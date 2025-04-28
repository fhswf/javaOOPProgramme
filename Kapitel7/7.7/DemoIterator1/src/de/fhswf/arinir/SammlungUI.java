package de.fhswf.arinir;

public class SammlungUI
{
    public static void main(String args[])
    {
        Sammlung eineSammlung = new Sammlung();
        String einElement;
        //Alle Objekte ausgeben
        for (Object o : eineSammlung)
        {
            einElement = (String) o;
            System.out.println("Element: " + einElement);
        }
    }
}

