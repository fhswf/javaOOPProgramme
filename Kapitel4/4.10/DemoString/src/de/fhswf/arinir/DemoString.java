package de.fhswf.arinir;

public class DemoString
{
    public static void main(String args[])
    {
        String text = "Java";
        //Wandle in Großbuchstaben
        text.toUpperCase();
        //Das Ursprungsobjekt wird nicht verändert, d. h.
        //die Methode toUpperCase() hat keine Wirkung
        System.out.println(text);
        //Neues Objekt außerhalb des Konstantenpools
        String textGross = text.toUpperCase();
        System.out.println(textGross);
    }
}