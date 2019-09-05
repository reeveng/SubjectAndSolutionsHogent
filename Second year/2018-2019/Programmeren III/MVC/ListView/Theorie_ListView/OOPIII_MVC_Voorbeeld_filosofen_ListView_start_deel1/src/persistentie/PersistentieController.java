package persistentie;

import java.util.List;

public class PersistentieController {

    private FilosofenMapper filosofenMapper;

    public List<String> geefFilosofen() {
        if (filosofenMapper == null) {
            filosofenMapper = new FilosofenMapper();
        }
        return filosofenMapper.geefFilosofen();
    }
}
