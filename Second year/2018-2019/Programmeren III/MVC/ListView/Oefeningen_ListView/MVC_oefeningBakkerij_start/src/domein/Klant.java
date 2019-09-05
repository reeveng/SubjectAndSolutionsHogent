package domein;

import java.util.Objects;

public class Klant 
{

    private int klantNr;
    private String naam, voornaam, gsmNr;

    public Klant(String naam, String voornaam, String gsmNr)
    {
        setNaam(naam);
        setVoornaam(voornaam);
        setGsmNr(gsmNr);
    }

    protected Klant()
    {

    }

    public int getKlantNr()
    {
        return klantNr;
    }

    private void setKlantNr(int klantNr)
    {
        this.klantNr = klantNr;
    }

    public String getNaam()
    {
        return naam;
    }

    private void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getVoornaam()
    {
        return voornaam;
    }

    private void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }

    public String getGsmNr()
    {
        return gsmNr;
    }

    private void setGsmNr(String gsmNr)
    {
        this.gsmNr = gsmNr;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.naam);
        hash = 23 * hash + Objects.hashCode(this.voornaam);
        hash = 23 * hash + Objects.hashCode(this.gsmNr);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Klant other = (Klant) obj;
        if (!Objects.equals(this.naam, other.naam))
        {
            return false;
        }
        if (!Objects.equals(this.voornaam, other.voornaam))
        {
            return false;
        }
        return Objects.equals(this.gsmNr, other.gsmNr);
    }

    public String getVolledigeNaam()
    {
        return naam + " " + voornaam;
    }

}
