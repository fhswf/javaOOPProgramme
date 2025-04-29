package inout;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Diese Klasse stellt Methoden zur Verfügung, <br/>
 * um Texte und einfache Typen von der Konsole einzulesen.<br/>
 * Die Ausnahmebehandlung ist Aufgabe des Aufrufers.<hr/>
 *
 * @author Helmut Balzert
 * @version 3.0 / Java 8-Version
 */
public class Console
{
    private static Scanner sc;

    //Unterdrückung des default-Konstruktor,
    //um eine Objekterzeugung zu verhindern
    private Console()
    {
        //Dieser Konstruktor wird nie aufgerufen
    }

    /**
     * Liest eine Zeile von der Konsole
     *
     * @return Eingelesene Zeile vom Typ String.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     */
    public static String readString() throws NoSuchElementException, IllegalStateException
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * Liest eine Zeile von der Konsole
     *
     * @return Eingelesene Zeile vom Typ char[].
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     */
    public static char[] readCharArray() throws NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.toCharArray();
    }

    /**
     * Liest einen booleschen Wert von der Konsole
     *
     * @return Boolescher Wert true oder false.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     * @throws InputMismatchException: Die Eingabe entspricht nicht dem Typ.
     */
    public static boolean readBoolean()
            throws InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextBoolean();
    }

    /**
     * Liest eine Ganzzahl von der Konsole
     *
     * @return Eingelesene Zahl vom Typ int.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     * @throws InputMismatchException: Die Eingabe entspricht nicht dem Typ.
     */
    public static int readInt()
            throws InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Liest das erste Zeichen einer Eingabe von der Konsole
     *
     * @return Eingelesenes Zeichen vom Typ char.
     * @throws NoSuchElementException: Es wurde keine Eingabe gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     */
    public static char readChar()
            throws NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.next().charAt(0);
    }

    /**
     * Liest eine Gleitkommazahl von der Konsole
     *
     * @return Eingelesene Zahl vom Typ float.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     * @throws InputMismatchException: Die Eingabe entspricht nicht dem Typ.
     */
    public static float readFloat()
            throws InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    /**
     * Liest eine Gleitkommazahl mit doppelter Genauigkeit von der Konsole
     *
     * @return Eingelesene Zahl vom Typ double.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     * @throws InputMismatchException: Die Eingabe entspricht nicht dem Typ.
     */
    public static double readDouble()
            throws InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    /**
     * Liest eine lange Ganzzahl von der Konsole
     *
     * @return Eingelesene Zahl vom Typ long.
     * @throws NoSuchElementException: Es wurde keine Eingabezeile gefunden.
     * @throws IllegalStateException:  Die verwendete Methode ist nicht geöffnet.
     * @throws InputMismatchException: Die Eingabe entspricht nicht dem Typ.
     */
    public static long readLong()
            throws InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextLong();
    }
}