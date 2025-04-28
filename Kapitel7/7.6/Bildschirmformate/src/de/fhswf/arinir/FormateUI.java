package de.fhswf.arinir;

class FormateUI implements AlleFormate
{
    public static void main(String arg[])
    {
        System.out.println(CRT_Formate.X_XGA + " " + CRT_Formate.Y_XGA);
        System.out.println(AlleFormate.X_XGA + " " + AlleFormate.Y_XGA);
        System.out.println(TFT_Formate.X_WUXGA + " " + TFT_Formate.Y_WUXGA);
        // System.out.println
        // (AlleFormate.X_SVGA + " " + AlleFormate.Y_SVGA);
    }
}
