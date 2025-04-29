package de.fhswf.arinir;

public class TestDatenspeicher
{
    public static void main(String args[])
    {
        Datenspeicher<String> einName = new Datenspeicher<>();
        einName.setWert("Helmut");
        System.out.println("Vorname: " + einName.getWert());

        //Speicher für Integer
        DatenspeicherInteger eineZahl = new DatenspeicherInteger();
        eineZahl.setWert(367);
        System.out.println("Zahl: " + eineZahl.getWert());
    }
}