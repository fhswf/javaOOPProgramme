using System;
class KomplexeZahlen
{
    public static void Main()
    {
        Komplex ersteZahl, zweiteZahl;

        ersteZahl.RE = 12.5; ersteZahl.IM = 3.4;
        Console.WriteLine("erste Zahl: RE " + ersteZahl.RE + " IM " + ersteZahl.IM);
        
        zweiteZahl.RE = 17.5; zweiteZahl.IM = 6.6;
        Console.WriteLine("zweite Zahl: RE " + zweiteZahl.RE + " IM " + zweiteZahl.IM);
        
        Komplex dritteZahl = new Komplex(); //Erzeugung mit new
        dritteZahl = dritteZahl.addiereKomplex(ersteZahl, zweiteZahl);
        Console.WriteLine("dritte Zahl: RE " + dritteZahl.RE + " IM " + dritteZahl.IM);
    }
}

struct Komplex
{
    public double RE;
    public double IM;

    public Komplex addiereKomplex(Komplex zahl1, Komplex zahl2)
    {
        Komplex zahl3;
        zahl3.RE = zahl1.RE + zahl2.RE;
        zahl3.IM = zahl1.IM + zahl2.IM;
        return zahl3;
    }
}