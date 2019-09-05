package persistentie;

import domein.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public List<Product> getProductenLijst() {
        List<Product> productLijst = new ArrayList<>();
        productLijst.add(new Product("bruin brood", "brood", 2.2, 100));
        productLijst.add(new Product("wit brood", "brood", 2.2, 100));
        productLijst.add(new Product("meergranen brood", "brood", 2.4, 100));
        productLijst.add(new Product("koek creme", "koeken", 1.1, 100));
        productLijst.add(new Product("koek rozijn", "koeken", 1.1, 100));
        productLijst.add(new Product("koek choco", "koeken", 1.3, 100));
        productLijst.add(new Product("taart kriek", "taarten", 8.5, 100));
        productLijst.add(new Product("taart aardbei", "taarten", 10.5, 100));
        productLijst.add(new Product("taart frangipane", "taarten", 9.5, 100));
        productLijst.add(new Product("wit stokbrood", "stokbrood", 1.40,50));
        productLijst.add(new Product("bruin stokbrood", "stokbrood", 1.80,50));
        productLijst.add(new Product("authentiek stokbrood", "stokbrood", 2.0,50));
        productLijst.add(new Product("melkbrood", "melkbrood", 3.10,25));
        productLijst.add(new Product("chocoladebrood", "melkbrood", 2.90,25));
        productLijst.add(new Product("rozijnenbrood", "melkbrood", 3.30,25));
      
        return productLijst;
    }
}
