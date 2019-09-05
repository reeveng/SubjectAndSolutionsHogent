package persistentie;

import domein.Klant;
import java.util.ArrayList;
import java.util.List;

public class KlantMapper {

    public List<Klant> getKlantenLijst() {
        List<Klant> klanten = new ArrayList<>();

        klanten.add(new Klant("Sander", "Keymeulen", "0479121212"));
        klanten.add(new Klant("Glenn", "Tecqmenne", "0479112233"));
        klanten.add(new Klant("Dries", "Weyme", "0479445566"));
        klanten.add(new Klant("Stijn", "Kerckhove", "0479778899"));
        klanten.add(new Klant("Daan", "Callaert", "0479778899"));

        return klanten;
    }

}
