package persistentie;

import java.util.List;

import domein.Auto;
import domein.Onderhoud;

public class PersistentieController {

    public List<Auto> geefAutos() {
        return new AutoMapper().geefAutos();
    }

    public List<Onderhoud> geefOnderhoudVanAutos() {
        return new OnderhoudMapper().geefOnderhoudVanAutos();
    }
}
