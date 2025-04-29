package de.fhswf.arinir;

import java.util.HashMap;
import java.util.Map;

import de.fhswf.arinir.inout.Console;

public class Lexikon
{
    public static void main(String[] args)
    {
        Map<String, String> lex = new HashMap<>();

        lex.put("Paket", "package");
        lex.put("Klasse", "class");
        lex.put("Muster", "pattern");
        lex.put("Ausnahme", "exception");

        String deutsch = Console.readString();
        System.out.println(deutsch + " in Englisch: " + lex.get(deutsch));
    }
}