package domein;

import exceptions.EmptyListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQueueNietGeneriek {

    private MyQueue woordenQueue;

    @Before
    public void before() {
        woordenQueue = new MyQueue("woordenQueue");
    }

    @Test
    public void queueLeeg() {
        Assert.assertTrue(woordenQueue.isEmpty());
    }

    @Test
    public void woordenToevoegen() {
        woordenQueue.offer("lekker");
        woordenQueue.offer("zijn");
        woordenQueue.offer("wafels");
        Assert.assertFalse(woordenQueue.isEmpty());
    }

    @Test
    public void woordenDoorElkaarToevoegenVerwijderen() {
        woordenQueue.offer("lekker");
        woordenQueue.offer("zijn");

        Assert.assertEquals("lekker", woordenQueue.poll());
        woordenQueue.offer("wafels");

        Assert.assertEquals("zijn", woordenQueue.poll());
        Assert.assertEquals("wafels", woordenQueue.poll());
        Assert.assertTrue(woordenQueue.isEmpty());
    }

    @Test
    public void woordenVerwijderen() {
        woordenQueue.offer("wafels");
        woordenQueue.offer("zijn");
        woordenQueue.offer("lekker");
        Assert.assertFalse(woordenQueue.isEmpty());
        Assert.assertEquals("wafels", woordenQueue.poll());
        Assert.assertEquals("zijn", woordenQueue.poll());
        Assert.assertEquals("lekker", woordenQueue.poll());
        Assert.assertTrue(woordenQueue.isEmpty());
    }

    @Test(expected = EmptyListException.class)
    public void legeQueueElementVerwijderen() {
        woordenQueue.poll();
    }

    @Test
    public void toonQueue() {
        woordenQueue.offer("wafels");
        woordenQueue.offer("zijn");
        woordenQueue.offer("lekker");
        String zin = woordenQueue.toString().replaceAll("\\s+", " ").trim();
        Assert.assertEquals("The woordenQueue is: wafels zijn lekker", zin);
    }

    @Test
    public void toonLegeQueue()
    {
        String zin = woordenQueue.toString().replaceAll("\\s+"," ").trim();
        Assert.assertEquals("woordenQueue is empty", zin);
    }
}
