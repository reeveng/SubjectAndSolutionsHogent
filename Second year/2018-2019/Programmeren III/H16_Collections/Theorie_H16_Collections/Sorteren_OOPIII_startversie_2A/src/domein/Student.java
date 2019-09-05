package domein;

public class Student 
{

    private long stamboeknr;
    private String naam, voornaam, woonplaats;

    public Student(long stamboeknr, String naam, String voornaam, String woonplaats)
    {
        setStamboeknr(stamboeknr);
        setNaam(naam);
        setVoornaam(voornaam);
        setWoonplaats(woonplaats);
    }

    public long getStamboeknr()
    {
        return stamboeknr;
    }

    private void setStamboeknr(long stamboeknr)
    {
        if (stamboeknr == 0)
        {
            throw new IllegalArgumentException("Geen correct stamboeknr");
        }
        this.stamboeknr = stamboeknr;
    }

    public String getNaam()
    {
        return naam;
    }

    private void setNaam(String naam)
    {
        if (naam == null || naam.isEmpty())
        {
            throw new IllegalArgumentException("Naam moet ingevuld worden!");
        }
        this.naam = naam;
    }

    public String getVoornaam()
    {
        return voornaam;
    }

    private void setVoornaam(String voornaam)
    {
        if (voornaam == null || voornaam.isEmpty())
        {
            throw new IllegalArgumentException("Voornaam moet ingevuld worden!");
        }
        this.voornaam = voornaam;
    }

    public String getWoonplaats()
    {
        return woonplaats;
    }

    private void setWoonplaats(String woonplaats)
    {
        if (woonplaats == null || woonplaats.isEmpty())
        {
            throw new IllegalArgumentException("Woonplaats moet ingevuld worden!");
        }
        this.woonplaats = woonplaats;
    }

   

}
