package persistentie;

import domein.Bestelling;
import domein.Klant;
import domein.Product;
import java.util.List;

public class PersistentieController {

    public List<Klant> getKlantenLijst() {
        return new KlantMapper().getKlantenLijst();
    }

    public List<Bestelling> getBestellingenLijst() {
        return new BestellingMapper().getBestellingenLijst();
    }

    public List<Product> getProductenLijst() {
        return new ProductMapper().getProductenLijst();
    }
}
