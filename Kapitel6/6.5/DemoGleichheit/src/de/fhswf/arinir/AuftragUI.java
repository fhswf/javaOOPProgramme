package de.fhswf.arinir;

public class AuftragUI
{
    public static void main(String args[])
    {
        //Attribute
        Auftrag einAuftrag, identischerAuftrag, nocheinAuftrag;

        //1 Objekt erzeugen
        einAuftrag = new Auftrag(5, 5000);
        //Referenz kopieren
        identischerAuftrag = einAuftrag;
        //neues Objekt erzeugen
        nocheinAuftrag = new Auftrag(5, 5000);

        System.out.println("einAuftrag ist identisch mit identischerAuftrag: "
                + (einAuftrag == identischerAuftrag));

        System.out.println("einAuftrag ist identisch mit nocheinAuftrag: "
                + (einAuftrag == nocheinAuftrag));

        System.out.println("einAuftrag ist inhaltlich gleich mit nocheinAuftrag: "
                + einAuftrag.equals(nocheinAuftrag));
    }
}