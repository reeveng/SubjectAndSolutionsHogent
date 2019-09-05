package persistentie;

import domein.Bier;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistentieController {

    private BierMapper bierMapper;

    public List<Bier> leesBieren(File besnaam) {
        if (bierMapper == null) {
            bierMapper = new BierMapper();
        }
        return bierMapper.leesBieren(besnaam);
    }

//    public           void persisteerObject (     object, File bestand) {
/*TODO stap4
    
        try (             ) {
            
        } catch (IOException ex) {
            Logger.getLogger(BierMapper.class.getName()).log(Level.SEVERE, null, ex);
       }
   }*/
        
}
