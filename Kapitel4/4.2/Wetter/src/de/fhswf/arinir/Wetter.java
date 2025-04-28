package de.fhswf.arinir;

/**
 * Die Klasse <b>Wetter</b> ermöglicht es,
 * die Temperatur und <br/>
 * den Namen einer Wetterstation zu verwalten.
 * <hr/>
 *
 * @author Helmut Balzert
 * @version 1.0
 */
public class Wetter
{
    private int temperatur;
    private String station;

    /**
     * Der Konstruktoraufruf erfordert die Namensangabe
     * der Station.
     */
    public Wetter(String station)
    {
        this.station = station;
    }

    /**
     * Es wird die aktuelle Temperatur gespeichert.
     *
     * @param temperatur als ganzzahliger Wert.
     */
    public void setTemperatur(int temperatur)
    {

        this.temperatur = temperatur;
    }

    /**
     * Es wird die aktuelle Temperatur zurückgegeben.
     *
     * @return temperatur als ganzzahliger Wert.
     */
    public int getTemperatur()
    {
        return temperatur;
    }

    /**
     * Es wird der Name der Wetterstation zurückgegeben.
     *
     * @return Stationsname als String
     */
    public String getStation()
    {
        return station;
    }
}