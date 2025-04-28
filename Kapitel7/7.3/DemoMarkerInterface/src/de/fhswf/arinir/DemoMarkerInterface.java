package de.fhswf.arinir;

public class DemoMarkerInterface extends Object implements Cloneable
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        DemoMarkerInterface a = new DemoMarkerInterface();
        DemoMarkerInterface b = a.clone();
        boolean c;
        c = a instanceof Cloneable;
        System.out.println(c);
        c = b instanceof Cloneable;
        System.out.println(c);
    }

    public DemoMarkerInterface clone() throws CloneNotSupportedException
    {
        return (DemoMarkerInterface) super.clone();
    }
}