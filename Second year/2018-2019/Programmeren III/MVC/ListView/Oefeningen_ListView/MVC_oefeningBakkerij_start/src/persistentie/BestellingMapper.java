package persistentie;

import domein.Bestelling;
import domein.Klant;
import domein.Product;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class BestellingMapper {

    public List<Bestelling> getBestellingenLijst() {
        List<Bestelling> bestellingLijst = new ArrayList<>();
        List<Klant> klantLijst = new KlantMapper().getKlantenLijst();
        bestellingLijst.add(new Bestelling(klantLijst.get(0), new GregorianCalendar(2018, 0, 20), new GregorianCalendar(2018, 0, 25)));
        bestellingLijst.add(new Bestelling(klantLijst.get(0), new GregorianCalendar(2018, 0, 23), new GregorianCalendar(2018, 0, 25)));
        bestellingLijst.add(new Bestelling(klantLijst.get(0), new GregorianCalendar(2018, 0, 24), new GregorianCalendar(2018, 0, 25)));
        bestellingLijst.add(new Bestelling(klantLijst.get(0), new GregorianCalendar(2018, 0, 23), new GregorianCalendar(2018, 0, 30)));
        
        bestellingLijst.add(new Bestelling(klantLijst.get(1), new GregorianCalendar(2018, 0, 22), new GregorianCalendar(2018, 0, 25)));
        bestellingLijst.add(new Bestelling(klantLijst.get(1), new GregorianCalendar(2018, 0, 24), new GregorianCalendar(2018, 0, 25)));
        
        bestellingLijst.add(new Bestelling(klantLijst.get(2), new GregorianCalendar(2018, 0, 20), new GregorianCalendar(2018, 0, 25)));
        bestellingLijst.add(new Bestelling(klantLijst.get(2), new GregorianCalendar(2018, 0, 24), new GregorianCalendar(2018, 0, 30)));
        
        bestellingLijst.add(new Bestelling(klantLijst.get(3), new GregorianCalendar(2018, 0, 23), new GregorianCalendar(2018, 0, 25)));
        
        bestellingLijst.add(new Bestelling(klantLijst.get(4), new GregorianCalendar(2018, 0, 23), new GregorianCalendar(2018, 0, 25)));
        

        List<Product> productLijst = new ProductMapper().getProductenLijst();
 //klant 0 = Sander
        bestellingLijst.get(0).voegProductToe(productLijst.get(0),1);
        bestellingLijst.get(0).voegProductToe(productLijst.get(1),2);
        bestellingLijst.get(0).voegProductToe(productLijst.get(2),3);
        
        bestellingLijst.get(1).voegProductToe(productLijst.get(3),4);
        bestellingLijst.get(1).voegProductToe(productLijst.get(4),2);;
        
        bestellingLijst.get(2).voegProductToe(productLijst.get(6),2);
        
        bestellingLijst.get(3).voegProductToe(productLijst.get(0),3);
        bestellingLijst.get(3).voegProductToe(productLijst.get(1),1);
        bestellingLijst.get(3).voegProductToe(productLijst.get(2),1);
                
//klant 1   = Glenn 
        bestellingLijst.get(4).voegProductToe(productLijst.get(3),1);
        bestellingLijst.get(4).voegProductToe(productLijst.get(4),2);
        bestellingLijst.get(4).voegProductToe(productLijst.get(5),3);

        bestellingLijst.get(5).voegProductToe(productLijst.get(4),3);;
        
//klant2  = Dries
        bestellingLijst.get(6).voegProductToe(productLijst.get(6),1);
        bestellingLijst.get(6).voegProductToe(productLijst.get(7),2);
        bestellingLijst.get(6).voegProductToe(productLijst.get(8),3);
        
        bestellingLijst.get(7).voegProductToe(productLijst.get(0),1);
                
//klant 3 = Stijn
        bestellingLijst.get(8).voegProductToe(productLijst.get(0),1);
        bestellingLijst.get(8).voegProductToe(productLijst.get(1),2);
        bestellingLijst.get(8).voegProductToe(productLijst.get(2),3);
        
//klant 4 = Daan
        bestellingLijst.get(9).voegProductToe(productLijst.get(2),10);
        

        return bestellingLijst;
    }
}
