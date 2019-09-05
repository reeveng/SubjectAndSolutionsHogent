package persistentie;

import java.util.List;

import domein.Auto;

public class PersistentieController {

    private AutoMapper autoMapper;

    public List<Auto> geefAutos() {
        if (autoMapper == null) {
            autoMapper = new AutoMapper();
        }
        return autoMapper.geefAutos();
    }
}
