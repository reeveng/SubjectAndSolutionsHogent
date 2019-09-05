package domein;

import java.util.ArrayList;
import java.util.List;
import persistentie.PersistentieController;

public class Zoo {

    private List<Verzorger> verzorgers;
    private List<Dier> dieren;
    private List<Gebouw> gebouwen;

    public Zoo() {
        this.dieren = new PersistentieController().geefDieren();
        this.verzorgers = new PersistentieController().geefVerzorgers();
        this.gebouwen = new PersistentieController().geefGebouwen();
    }

    /*
     * Geeft alle dieren terug die behoren tot de diersoort met de opgegeven naam. De lijst van
     * dieren moet gesorteerd zijn op gewicht (laag naar hoog).
     */
    public List<Dier> geefDierenVanSoortMetNaam(String soortNaam) {
    //TODO
    return null;
    }

    /*
     * Geeft het gemiddelde gewicht terug van alle dieren die verblijven in het gebouw met de
     * opgegeven naam. Geeft 0 terug indien er geen gebouw is met deze naam.
     */
    public double geefGemiddeldeGewichtVanDierenInGebouwMetNaam(String gebouwNaam) {
     //TODO
     return 0;
    }

    /*
     * Geeft de namen van de dieren terug die verzorgd worden door de verzorger met het opgegeven
     * nummer. Geeft een lege lijst terug indien er geen verzorger is met dit nummer.
     */
    public List<String> geefNamenVanDierenVanVerzorgerMetNummer(int verzorgerNummer) {
    //TODO
    return null;
        }
    

//    /*
//     * Geeft een lijst terug van verzorgers die een of meerdere dieren verzorgen die verblijven in
//     * het gebouw met de opgegeven naam. Geeft een lege lijst terug indien er geen gebouw is met
//     * deze naam.
    //    * NU DUMMY UITWERKING voor test gebruik in deze toepassing 
//  *  NIET VERDER UITWERKEN
//     */
    public List<Verzorger> verzorgersInGebouwMetNaam(String gebouwNaam) {
        if (gebouwNaam.equalsIgnoreCase("Reptielen")) {
            return verzorgers;
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * De methode maakOverzichtVolgensSoort geeft een overzicht (Map) terug van
     * alle dieren per Soort.
     */
    //TODO
    // TODO METHODE ....maakOverzichtVolgensSoort() ... hier uitschrijven

    
    //
}