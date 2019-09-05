package testen;

import org.junit.Assert;
import org.junit.Test;

import domein.Application;
import domein.ApplicationFactory;

public class TestApplication {

    @Test
    public void testDrawing() {
        Application application = ApplicationFactory.createApplication("drawing");
        application.addNewDocument("drawing1");
        application.addNewDocument("drawing2");
 //Uncomment
//        Assert.assertTrue(application.getDocument("drawing1") instanceof DrawingDocument);
//        Assert.assertTrue(application.getDocument("drawing2") instanceof DrawingDocument);
    }

    @Test
    public void testStatistics() {
        Application application = ApplicationFactory.createApplication("statistics");
        application.addNewDocument("stat1");
        application.addNewDocument("stat2");
//Uncomment
//        Assert.assertTrue(application.getDocument("stat1") instanceof StatisticsDocument);
//        Assert.assertTrue(application.getDocument("stat2") instanceof StatisticsDocument);
    }
}
