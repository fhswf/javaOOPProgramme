package de.fhswf.arinir;

//Demonstration von Botschaften
public class Kunde
{
    private String name;
    private Anzeige eineAnzeige; //Referenzattribut

    //Konstruktor
    public Kunde()
    {
    }

    //Lesende Objektoperationen
    public String getName()
    {
        return name;
    }

    //Schreibende Objektoperationen
    public void setName(String kundenname)
    {
        name = kundenname;
    }

    public Anzeige erzeugeAnzeige(String titel, int preis)
    {
        eineAnzeige = new Anzeige(titel);
        eineAnzeige.setPreis(preis);
        return eineAnzeige;
    }
}
