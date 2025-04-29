package de.fhswf.arinir;

public class Dreieckstausch
{
    //generische Methodendeklaration
    public static <Elem> void tausche(Elem[] feld)
    {
        Elem merke = feld[0];
        feld[0] = feld[1];
        feld[1] = merke;
    }

    public static void main(String args[])
    {
        Double einFeld[] = {new Double(1.0f), new Double(2.0f)};
        Dreieckstausch.tausche(einFeld);
        System.out.println("Element[0] " + einFeld[0]);
        System.out.println("Element[1] " + einFeld[1]);
        String nocheinFeld[] = {"Eins", "Zwei"};
        Dreieckstausch.tausche(nocheinFeld);
        System.out.println("Element[0] " + nocheinFeld[0]);
        System.out.println("Element[1] " + nocheinFeld[1]);
    }
}
