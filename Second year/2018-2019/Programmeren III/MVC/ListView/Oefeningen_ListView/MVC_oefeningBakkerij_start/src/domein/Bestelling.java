package domein;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bestelling {

    private final Klant klant;
    private final GregorianCalendar besteldatum;
    private final GregorianCalendar afhaaldatum;
    private Map<Product, Integer> productMap  = new HashMap<>();

    public Bestelling(Klant klant, GregorianCalendar besteldatum, GregorianCalendar afhaaldatum) {
        this.klant = klant;
        this.besteldatum = besteldatum;
        this.afhaaldatum = afhaaldatum;
    }

    public Klant getKlant() {
        return klant;
    }

    public GregorianCalendar getBesteldatum() {
        return besteldatum;
    }

    public GregorianCalendar getAfhaaldatum() {
        return afhaaldatum;
    }

    public Map<Product, Integer> getProductMap() {
        return Collections.unmodifiableMap(productMap);
    }

    public Set<Product> getProducten() {
        return Collections.unmodifiableSet(productMap.keySet());
    }

    public void voegProductToe(Product nieuw, int aantal) {
        if (productMap.containsKey(nieuw)) {
            productMap.put(nieuw, productMap.get(nieuw)+aantal);
        }
        productMap.put(nieuw, aantal);
    }

    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        return "Bestelling{" + "klant=" + klant + ", besteldatum=" +fmt.format(besteldatum.getTime()) 
                + ", afhaaldatum=" + fmt.format(afhaaldatum.getTime()) + ", producten=" + productMap.keySet() + '}';
    }
  public String verkorteWeergave()
    {
        return String.format(
                "Besteld op: %1$td-%1$tb-%1$ty  Afhalen op: %2$td-%2$tb-%2$ty Bedrag: %3$.2f", 
                besteldatum.getTime(),
                afhaaldatum.getTime(),
                geefTebetalenBedragBestelling());
    }

    private double geefTebetalenBedragBestelling()
    { 
       return productMap.entrySet().stream()
               .map((entry) -> entry.getKey().getPrijs()*entry.getValue())
               .reduce(0.0, (x,y) -> x+y);
      
    }
}
