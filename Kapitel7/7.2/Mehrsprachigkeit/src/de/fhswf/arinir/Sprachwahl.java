package de.fhswf.arinir;

import de.fhswf.arinir.inout.*;

public class Sprachwahl
{
    public static void main(String args[])
    {
        System.out.println("Bitte Sprache wählen. "
                + "Please choose your language.");
        System.out.println("Deutsch: d English: e");
        char sprache = Console.readChar();
        DialogI einDialog;
        //Sprachauswahl
        if (sprache == 'd')
            einDialog = new DialogDeutsch();
        else
            einDialog = new DialogEnglisch();
        //ab hier ist die Sprache eingestellt
        einDialog.zeigeDialog();
    }
}