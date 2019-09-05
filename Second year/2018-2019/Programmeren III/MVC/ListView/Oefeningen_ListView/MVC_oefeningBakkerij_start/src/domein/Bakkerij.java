package domein;

import java.util.List;
import static java.util.stream.Collectors.toList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import persistentie.PersistentieController;

public class Bakkerij {

    private final List<Klant> klanten;
    private final List<Bestelling> bestellingen;
    private final List<Product> producten;

    public Bakkerij() {
        klanten = new PersistentieController().getKlantenLijst();
        bestellingen = new PersistentieController().getBestellingenLijst();
        producten = new PersistentieController().getProductenLijst();
    }

    public List<Klant> getKlanten() {
        return klanten;
    }

    public List<Bestelling> getBestellingen() {
        return bestellingen;
    }

    public List<Product> getProducten() {
        return producten;
    }

    //----- JavaFX
//    public  geefBestellingenVanKlant(Klant geselecteerdeKlant) {
          
    public Klant getKlantBijNaam(String volledigeNaam) {
        return klanten.stream()
                .filter(klant -> klant.getVolledigeNaam().equals(volledigeNaam))
                .findAny()
                .orElse(null);
    }

    public Product getProductBijNaam(String productnaam) {
        return producten.stream()
                .filter(p -> p.getNaam()
                .equals(productnaam))
                .findAny()
                .orElse(null);
    }
   
    
}
