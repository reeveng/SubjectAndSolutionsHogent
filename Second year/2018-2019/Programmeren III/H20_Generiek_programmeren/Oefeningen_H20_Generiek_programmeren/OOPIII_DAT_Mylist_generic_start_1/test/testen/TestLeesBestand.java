package testen;

import domein.Bier;
import domein.MyListIterable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.junit.Assert;
import org.junit.Test;

public class TestLeesBestand {

    private final Object[][] resultaat = {{"WestVleteren_Blond", 5.0},
    {"Tripel_Kanunnik", 8.2}, {"Black_Albert", 13.0},
    {"Rochefort_10", 11.0},
    {"AlpaÃ¯de", 9.5}, {"Cantillon_Geuze", 5.0},
    {"Moinette_Blonde", 8.5}, {"Wilderen_Goud", 6.0},
    {"Tripel_Karmeliet", 8.4}, {"Westmalle_Tripel", 9.5},};

    private MyListIterable<Bier> leesBestand() {
        MyListIterable<Bier> myList;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("bierenListObj.dat"))) {
            return (MyListIterable<Bier>) in.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            return null;
        }
    }

    @Test
    public void leesTest() {
        MyListIterable<Bier> myList = leesBestand();

        Assert.assertFalse(myList.isEmpty());

        for (int rijIndex = 0; rijIndex < resultaat.length; rijIndex++) {
            Bier bier = myList.removeFromFront();
            Assert.assertEquals((String) resultaat[rijIndex][0], bier.getBierNaam());
            Assert.assertEquals((Double) resultaat[rijIndex][1], bier.getAlcohol(), 0.0);
        }

        Assert.assertTrue(myList.isEmpty());
    }
}

