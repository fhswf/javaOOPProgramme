/**
 * UI-Klasse: AufgabenplanerUI
 */

package de.fhswf.arinir;

import de.fhswf.arinir.inout.Console;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.Locale;

class AufgabenplanerUI
{
    private static ObjektContainer meinContainer = ObjektContainer.getObjektreferenz();
    private final static DateTimeFormatter meinKurzformat = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
    private final static DateTimeFormatter meinLangformat = DateTimeFormatter.ofPattern("EEEE, d. MMMM Y", Locale.GERMAN);
    private final static String linie = "--------------------------------------------------------";

    //Hauptprogramm ----------------------------------------------
    public static void main(String args[])
    {
        char eingabeAuswahl;
        for (; ; )
        {
            System.out.println("Ihr Aufgabenplaner - Funktionen:");
            System.out.println("1: Neue Aufgabe erfassen");
            System.out.println("2: Aufgabe anzeigen - Stichwort");
            System.out.println("3: Alle Aufgaben - sortiert");
            System.out.println("4: Kontaktperson/Mitarbeiter erfassen");
            System.out.println("5: Alle Personen anzeigen");
            System.out.println("6: Zu Aufgabe Kontaktperson zuordnen");
            System.out.println("7: Zu Aufgabe Mitarbeiter zuordnen");
            System.out.println("8: Aufgabe/Person/Mitarbeiter ändern oder löschen");
            System.out.println("9: Abbruch");
            System.out.print("Bitte Ziffer 1 bis 9 eingeben: ");
            eingabeAuswahl = Console.readChar();
            if (eingabeAuswahl == '9') break;

            switch (eingabeAuswahl)
            {
                case '1':
                    AufgabenplanerUI.erfasseAufgabe();
                    break;
                case '2':
                    AufgabenplanerUI.anzeigeAufgabeStichwort();
                    break;
                case '3':
                    AufgabenplanerUI.anzeigeAufgabenSortiert();
                    break;
                case '4':
                    AufgabenplanerUI.erfassePerson();
                    break;
                case '5':
                    AufgabenplanerUI.anzeigePersonen();
                    break;
                case '6':
                    AufgabenplanerUI.zuordnePersonZuAufgabe();
                    break;
                case '7':
                    AufgabenplanerUI.zuordneMitarbeiterZuAufgabe();
                    break;
                case '8':
                    AufgabenplanerUI.bearbeiteAufgabePersonMitarbeiter();
                    break;
                default:
                    System.out.println("Fehlerhafte Eingabe: Bitte nur 1 bis 8 eingeben");
            }
        }
        meinContainer.endeAnwendung();
        System.out.println("Ende des Aufgabenplaners");
    }

    // Funktion 1
    private static void erfasseAufgabe()
    {
        String stichwort; //Muss
        for (; ; )
        {
            stichwort = erfasseText("Stichwort", true);
            if (meinContainer.gibAufgabe(stichwort) == null)
                break;
            else
                System.out.println("Stichwort bereits belegt");
        }
        String beschreibung = erfasseText("Beschreibung", true);
        LocalDate fertigAm = erfasseDatum("Geplantes Ende tt.mm.jjjj", true, true);
        if (fertigAm != null)
            System.out.println("Gelesenes Datum:" + meinKurzformat.format(fertigAm));
        Character prioritaet = erfasseCharacter("Priorität a, b, c", false, new char[]{'a', 'b', 'c'});
        Character kategorie = erfasseCharacter("Kategorie Beruf, Privat: b/p", false, new char[]{'b', 'p'});
        Character status = erfasseCharacter("Status NichtBegonnen, InBearbeitung, WartenAufAnderen,\n" +
                "Zurueckgestellt, Erledigt: n/i/w/z/e", false, new char[]{'n', 'i', 'w', 'z', 'e'});

        //Einlesen: Kontaktperson
        System.out.println("Kontaktperson zuordnen - Alle Spitznamen: ");
        Iterator e = meinContainer.iteratorMitarbeiter();
        while (e.hasNext())
        {
            System.out.print(((Person) e.next()).getSpitzname().toLowerCase() + " ");
        }
        System.out.println("\nLeere Eingabe: Keine Zuordnung");
        Person kontaktperson = ermittlePerson(false);

        //Aufgabenobjekt erstellen
        meinContainer.einfuegeAufgabe(stichwort, beschreibung, fertigAm, prioritaet, kategorie, status, kontaktperson);
    } //Ende Funktion 1

    //Funktion 2
    private static void anzeigeAufgabeStichwort()
    {
        //Einlesen: Stichwort (Muss)
        Aufgabe eineAufgabe = ermittleAufgabe();
        if (eineAufgabe != null)
        {
            druckeAufgabe(eineAufgabe);
            System.out.println(linie);
        }
    }//Ende Funktion 2

    //Funktion 3
    private static void anzeigeAufgabenSortiert()
    {
        //Einlesen: Kategorie (Muss)
        char sortChar = erfasseCharacter("Sortiert nach Termin, ABC, Beruflich, Privat, Status: t/a/b/p/s",
                true, new char[]{'t', 'a', 'b', 'p', 's'});
        Iterator<Aufgabe> e = meinContainer.iteratorAufgaben(sortChar);
        while (e.hasNext())
            druckeAufgabe(e.next());
        System.out.println(linie);
    }//Ende Funktion 3

    //Funktion 4
    private static void erfassePerson()
    {
        //Einlesen: Spitzname (Muss)
        String spitzname;
        for (; ; )
        {
            spitzname = erfasseText("Spitzname", true);
            if (meinContainer.gibPerson(spitzname) == null)
                break;
            else
                System.out.println("Spitzname bereits belegt");
        }
        String nachname = erfasseText("Nachname", true);
        String vorname = erfasseText("Vorname", false);
        String telefon = erfasseText("Telefon", false);
        String email = erfasseText("E-Mail", false);

        //Einlesen: Person oder Mitarbeiter (Muss)
        char personenArt = erfasseCharacter("Kontaktperson oder Mitarbeiter (k/m)", true, new char[]{'k', 'm'});
        if (personenArt == 'm')
        {
            String abteilung = erfasseText("Abteilung", false);
            meinContainer.einfuegePerson(spitzname, nachname, vorname, telefon, email, abteilung);
        }
        else
        {
            meinContainer.einfuegePerson(spitzname, nachname, vorname, telefon, email, null);
        }
    }//Ende Funktion 4

    //Funktion 5
    private static void anzeigePersonen()
    {
        System.out.println(linie);
        Iterator<Person> e = meinContainer.iteratorPersonen();
        while (e.hasNext())
            System.out.println(e.next());
        System.out.println(linie);
    }//Ende Funktion 5

    //Funktion 6
    private static void zuordnePersonZuAufgabe()
    {
        Aufgabe eineAufgabe = ermittleAufgabe();
        if (eineAufgabe != null)
        {
            Person kontaktperson = ermittlePerson(true);
            if (kontaktperson != null)
            {
                eineAufgabe.setKontaktperson(kontaktperson);
                System.out.println("Kontaktperson zur Aufgabe zugeordnet");
            }
        }
    }//Ende Funktion 6

    //Funktion 7
    private static void zuordneMitarbeiterZuAufgabe()
    {
        Aufgabe eineAufgabe = ermittleAufgabe();
        if (eineAufgabe != null)
        {
            //Mehrere Bearbeiter möglich
            for (; ; )
            {
                Mitarbeiter bearbeiter = ermittleMitarbeiter();
                if (bearbeiter != null)
                {
                    String taetigkeit = erfasseText("Tätigkeit", true);
                    LocalDate endeTermin;
                    for (; ; )
                    {
                        //Endetermin kein Pflichtfeld, aber wenn Eingabe vorhanden, dann in Zukunft
                        endeTermin = erfasseDatum("Geplantes Ende tt.mm.jjjj", false, true);

                        //Da ebenfalls Aufgabe.fertigAm kein Pflichtfeld ist, kann es sein, dass fertigAm=null ist
                        //In dem Fall kann die Taetigkeit nicht in der Zukunft liegen und gleichzeitig
                        //vor dem Ende der Aufgabe
                        if (eineAufgabe.getFertigAm() != null && endeTermin != null &&
                                endeTermin.isAfter(eineAufgabe.getFertigAm()))
                        {
                            System.out.println("Tätigkeit muss vor dem Ende der Aufgabe liegen.");
                            continue;
                        }
                        break;
                    }

                    //assoziative Klasse erzeugen und mit Aufgabe und Bearbeiter verbinden
                    Taetigkeit teilaufgabe = new Taetigkeit(taetigkeit, endeTermin, bearbeiter);
                    eineAufgabe.addTeilaufgabe(teilaufgabe);
                }
                if (erfasseCharacter("Noch ein Bearbeiter j/n", true, new char[]{'j', 'n'}) == 'n')
                    break;
            }
        }
    } //Ende Funktion 7

    //Funktion 8
    private static void bearbeiteAufgabePersonMitarbeiter()
    {
        System.out.println("Funktion leider noch nicht implementiert");
    }
    //Ende Funktion 8


    //Hilfsmethode: Ermittlung einer Aufgabe
    private static Aufgabe ermittleAufgabe()
    {
        String stichwort = erfasseText("Stichwort", true);
        Aufgabe ergebnis = meinContainer.gibAufgabe(stichwort);
        if (ergebnis == null)
            System.out.println("Aufgabe nicht vorhanden");
        return ergebnis;
    }

    //Hilfsmethode: Ermittlung einer Person
    private static Person ermittlePerson(boolean pflicht)
    {
        String spitzname = erfasseText("Spitzname", pflicht);
        Person ergebnis = meinContainer.gibPerson(spitzname);
        if (ergebnis == null)
            System.out.println("Person nicht vorhanden");
        return ergebnis;
    }

    //Hilfsmethode: Ermittlung eines Mitarbeiters
    private static Mitarbeiter ermittleMitarbeiter()
    {
        String spitzname = erfasseText("Spitzname", true);
        Mitarbeiter ergebnis = meinContainer.gibMitarbeiter(spitzname);
        if (ergebnis == null)
            System.out.println("Mitarbeiter nicht vorhanden");
        return ergebnis;
    }

    //Hilfsmethode: Einlesen eines Textes
    private static String erfasseText(String bezeichnung, boolean pflicht)
    {
        String ergebnis = "";
        for (; ; )
        {
            System.out.println(bezeichnung + ": ");
            ergebnis = Console.readString();
            if (pflicht)
            {
                if (ergebnis != null && !"".equals(ergebnis))
                {
                    //Eingabe ist vorhanden
                    return ergebnis;
                }
                else
                {
                    System.out.println(bezeichnung + " ist ein Pflichtfeld");
                    continue;
                }
            }
            //Kein Pflichtfeld
            return ergebnis;
        }
    }

    /**
     * Hilfsmethode: Einlesen eines Datums
     * @param bezeichnung
     * @param pflicht
     * @param future
     * @return
     * wenn pflicht==true, dann eingelesenes Datum
     * wenn pflicht==false, dann eingelesenes Datum oder null bei falscher Eingabe
     */
    private static LocalDate erfasseDatum(String bezeichnung, boolean pflicht, boolean future)
    {
        LocalDate ergebnis = null;
        for (; ; )
        {
            System.out.println(bezeichnung + ": ");
            try
            {
                //Wenn nichts eingegeben wurde, dann wird null zurueckgegeben
                ergebnis = Console.readDate();
                if (pflicht && ergebnis == null)
                {
                    System.out.println(bezeichnung + " ist ein Pflichtfeld");
                    continue;
                }
                if (future && ergebnis != null)
                {
                    if (ergebnis.isAfter(LocalDate.now())) return ergebnis;
                    System.out.println("Datum muss in der Zukunft liegen.");
                    continue;
                }
                return ergebnis;
            }
            catch (DateTimeParseException e)
            {
                if (pflicht)
                {
                    System.out.println(bezeichnung + " ist ein Pflichtfeld");
                    continue;
                }
                return null;
            }
        }
    }

    /**
     * Hilfsmethode: Einlesen eines Character
     * @param bezeichnung
     * @param pflicht
     * @param moeglicheWerte
     * @return
     * falls pflicht==true, dann Wert aus moeglicheWert
     * falls pflicht==false, dann Wert aus moeglicheWert oder null bei falscher Eingabe
     */
    private static Character erfasseCharacter(String bezeichnung, boolean pflicht, char[] moeglicheWerte)
    {
        char ergebnis = 0;
        for (; ; )
        {
            System.out.println(bezeichnung + ": ");
            //Console erwartet zumindest ein beliebiges Zeichen, das eingegeben wird
            ergebnis = Console.readChar();
            for (char c : moeglicheWerte)
            {
                if (c == ergebnis) return ergebnis;
            }
            if (pflicht)
            {
                System.out.println(bezeichnung + " ist ein Pflichtfeld");
                continue;
            }
            return null;
        }
    }

    //Hilfsmethode: Formatierte Ausgabe einer Aufgabe
    private static void druckeAufgabe(Aufgabe eineAufgabe)
    {
        System.out.println(linie);
        System.out.print(eineAufgabe.getPrioritaet().toString().toUpperCase() + " | " +
                eineAufgabe.getStichwort().toUpperCase() + " | " +
                eineAufgabe.getKategorie().toString());
        if (eineAufgabe.getErfasstAm() != null)
            System.out.println(" | Erfasst am: " + meinKurzformat.format(eineAufgabe.getErfasstAm()));
        if (eineAufgabe.getFertigAm() != null)
            System.out.print("Termin: " + meinLangformat.format(eineAufgabe.getFertigAm()) + " | ");
        System.out.println(eineAufgabe.getStatus().toString());
        System.out.println("Beschreibung: " + eineAufgabe.getBeschreibung());
        if (eineAufgabe.getKontaktperson() != null)
            System.out.println("Kontaktperson: " + eineAufgabe.getKontaktperson());
        //Alle Bearbeiter
        System.out.println("Teilaufgaben delegiert an: ");
        Iterator<Taetigkeit> it = eineAufgabe.iteratorTeilaufgaben();
        while (it.hasNext())
        {
            Taetigkeit t = (Taetigkeit) it.next();
            if (eineAufgabe.getErfasstAm() != null)
            {
                System.out.print(t.getBearbeiter().getSpitzname().toUpperCase() + " " + t.getBeschreibung());
                if (t.getEndeTermin() != null)
                    System.out.print(" | Termin: " + meinKurzformat.format(t.getEndeTermin()));
                System.out.println();
            }
        }
    }
}