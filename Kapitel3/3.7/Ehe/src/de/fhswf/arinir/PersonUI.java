package de.fhswf.arinir;

public class PersonUI
{

    public static void main(String args[])
    {
        Person einSingle = new Person("Nolte", "Volker");
        Person nocheinSingle = new Person("Bering", "Elvira");
        einSingle.setPartner(nocheinSingle, "02.01.2007");
        nocheinSingle.setPartner(einSingle, "02.01.2007");
        //Ausgangspunkt einSingle
        System.out.println(einSingle.getVorname() + " " + einSingle.getFamilienname() + " und ");
        //Partner von einSingle ermitteln
        Person partner = einSingle.getPartner();
        System.out.println(partner.getVorname()
                + " " + partner.getFamilienname()
                + "\nhaben am " + einSingle.getHochzeitsdatum()
                + " geheiratet");
    }
}
