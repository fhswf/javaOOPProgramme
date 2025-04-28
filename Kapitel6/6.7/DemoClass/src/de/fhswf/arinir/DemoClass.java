package de.fhswf.arinir;

public class DemoClass
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        Class verw;
        //Referenz auf Verwaltungs-Objekt holen
        //über Methode von Object
        verw = a.getClass();
        System.out.println("a ist ein Objekt der Klasse: " + verw.getName());
        System.out.println("Stringdarstellung des Objekts: " + a.toString());

        verw = b.getClass();
        System.out.println("b ist ein Objekt der Klasse: " + verw.getName());
        System.out.println("Stringdarstellung des Objekts: " + b.toString());

        verw = verw.getSuperclass();
        System.out.println("b’s Oberklasse ist: " + verw.getName());
    }
}