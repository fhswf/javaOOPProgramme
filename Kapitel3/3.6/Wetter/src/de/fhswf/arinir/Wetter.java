package de.fhswf.arinir;

public class Wetter
{
    private int temperatur;
    private String station;

    public Wetter(String station)
    {
        this.station = station;
    }

    public void setTemperatur(int temperatur)
    {
        this.temperatur = temperatur;
    }

    public int getTemperatur()
    {
        return temperatur;
    }

    public String getStation()
    {
        return station;
    }
}
