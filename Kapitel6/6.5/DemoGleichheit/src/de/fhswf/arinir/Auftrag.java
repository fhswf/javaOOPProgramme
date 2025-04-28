package de.fhswf.arinir;

public class Auftrag extends Object
{
    private int nummer = 0;
    private int auftragssumme = 0;// in Cent

    public Auftrag(int nummer, int auftragssumme)
    {
        this.nummer = nummer;
        this.auftragssumme = auftragssumme;
    }

    //getter-Methoden
    public int getNummer()
    {
        return nummer;
    }

    public int getAuftragssumme()
    {
        return auftragssumme;
    }

    //Redefinierte Methode
    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (!(obj instanceof Auftrag)) return false;
        Auftrag einAuftrag = (Auftrag) obj;
        if (nummer == einAuftrag.getNummer() &&
                auftragssumme == einAuftrag.getAuftragssumme())
            return true;
        else
            return false;
    }
}
