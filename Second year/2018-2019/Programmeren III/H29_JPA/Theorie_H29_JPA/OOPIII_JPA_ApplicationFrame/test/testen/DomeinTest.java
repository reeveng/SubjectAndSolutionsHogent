package testen;

import domain.Bier;
import domain.DomeinController;
import domain.Winkel;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import repository.BierDao;
import repository.GenericDao;

public class DomeinTest {
    private GenericDao<Winkel> winkelRepo;
    private BierDao  bierRepo;
    
    private DomeinController domein;
    
    @Before
    public void before() {
        domein = new DomeinController(false);
        winkelRepo = Mockito.mock(GenericDao.class);
        bierRepo = Mockito.mock(BierDao.class);
        domein.setBierRepo(bierRepo);
        domein.setWinkelRepo(winkelRepo);
    }

    @Test
    public void voegBierBijWinkel() {
       final String BIERNAAM = "Duvel", WINKELNAAM = "Station";

       Winkel eenWinkel = new Winkel(WINKELNAAM);   
       Bier eenBier = new Bier(BIERNAAM, "Blond", 8.5, 9.9, "Moortgat");

       Mockito.when(winkelRepo.findAll()).thenReturn(Arrays.asList(eenWinkel));
       Mockito.when(bierRepo.getBierByName(BIERNAAM)).thenReturn(eenBier);
       
       assertFalse(eenWinkel.getBierSet().contains(eenBier));
       domein.voegBierBijWinkel(BIERNAAM, WINKELNAAM);
       assertTrue(eenWinkel.getBierSet().contains(eenBier));
       Mockito.verify(winkelRepo).findAll();
       Mockito.verify(bierRepo).getBierByName(BIERNAAM);
        
    }

}