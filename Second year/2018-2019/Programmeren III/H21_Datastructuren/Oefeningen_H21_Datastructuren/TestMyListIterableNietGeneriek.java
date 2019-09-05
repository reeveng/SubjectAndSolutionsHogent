package domein;

import exceptions.EmptyListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMyListIterableNietGeneriek
{
    private MyListIterable woordenLijst;

    @Before
    public void before()
    {
        woordenLijst = new MyListIterable("woordenlijst");
    }

    @Test
    public void toonLijst()
    {
        woordenLijst.insertAtFront("lekker");
        woordenLijst.insertAtFront("zijn");
        woordenLijst.insertAtFront("wafels");
        String zin = woordenLijst.toString().replaceAll("\\s+"," ").trim();
        Assert.assertEquals("The woordenlijst is: wafels zijn lekker", zin);
    }

    @Test
    public void toonLegeLijst()
    {
        String zin = woordenLijst.toString().replaceAll("\\s+"," ").trim();
        Assert.assertEquals("woordenlijst is empty", zin);
    }

}