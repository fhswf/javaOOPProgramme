package de.fhswf.arinir;

public class DemoCharSequence
{
    public static void main(String args[])
    {
        String einString = "Java ist toll";
        StringBuilder einStringBuilder = new StringBuilder("Java ist weit verbreitet");
        //Schnittstellenreferenz
        CharSequence str;
        str = einString;
        System.out.println("Länge: " + str.length());
        System.out.println("Teilkette: " + str.subSequence(9, 13));
        str = einStringBuilder;
        System.out.println("Länge: " + str.length());
        System.out.println("Teilkette: " + str.subSequence(9, 13));
    }
}
