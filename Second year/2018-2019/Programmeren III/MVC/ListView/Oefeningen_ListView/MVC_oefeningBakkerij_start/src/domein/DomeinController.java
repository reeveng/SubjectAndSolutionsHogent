package domein;

import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;
import javafx.collections.ObservableList;

public class DomeinController 
{

    private final Bakkerij bakkerij;
    private Klant geselecteerdeKlant;

    public DomeinController()
    {
        this.bakkerij = new Bakkerij();

    }

    public Klant getGeselecteerdeKlant()
    {
        return geselecteerdeKlant;
    }

    public void setGeselecteerdeKlant(String geselecteerdeKlant)
    {
        Klant klant = bakkerij.getKlantBijNaam(geselecteerdeKlant);
        this.geselecteerdeKlant = klant;
        
    }

    public List<String> getKlanten()
    {
        return bakkerij.getKlanten().stream()
                .distinct()
                .map(Klant::getVolledigeNaam)
                .collect(Collectors.toList());
    }

    public String getBestellingen()
    {
        return bakkerij.getBestellingen().toString();
    }

    public String getProducten()
    {
        return bakkerij.getProducten().toString();
    }

    // ------- JavaFX
//    public  geefBestellingenVanKlant()
    

}
