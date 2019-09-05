package testen;


import domein.Program;
import domein.Television;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {

    private Television television;
    private final int MAX = 5;

    @Before
    public void before() {
        television = new Television(MAX);
    }

    @Test
    public void testChannels() {
        Program program = television.getNextProgram();
        Assert.assertEquals(1, program.getNrChannel());
        program = television.getNextProgram();
        Assert.assertEquals(2, program.getNrChannel());
        program = television.getPrevProgram();
        Assert.assertEquals(1, program.getNrChannel());
        program = television.getPrevProgram();
        Assert.assertEquals(0, program.getNrChannel());
        program = television.getPrevProgram();
        Assert.assertEquals(4, program.getNrChannel());
        program = television.getNextProgram();
        Assert.assertEquals(0, program.getNrChannel());
        for (int i = 1; i < MAX; i++) {
            program = television.getNextProgram();
            Assert.assertEquals(i, program.getNrChannel());
        }
        program = television.getPrevProgram();
        Assert.assertEquals(3, program.getNrChannel());
        program = television.getNextProgram();
        Assert.assertEquals(4, program.getNrChannel());
    }

    @Test
    public void testVolgendeChannels() {
        int verwachteNrChannel = 1;
        for (int i = 0; i < 20; i++) {
            Program program = television.getNextProgram();
            Assert.assertEquals(verwachteNrChannel++, program.getNrChannel());
            if (verwachteNrChannel == MAX) {
                verwachteNrChannel = 0;
            }
        }
    }

    @Test
    public void testPrevChannels() {
        int verwachteNrChannel = MAX - 1;
        for (int i = 0; i < 20; i++) {
            Program program = television.getPrevProgram();
            Assert.assertEquals(verwachteNrChannel--, program.getNrChannel());
            if (verwachteNrChannel < 0) {
                verwachteNrChannel = MAX - 1;
            }
        }
    }

}
