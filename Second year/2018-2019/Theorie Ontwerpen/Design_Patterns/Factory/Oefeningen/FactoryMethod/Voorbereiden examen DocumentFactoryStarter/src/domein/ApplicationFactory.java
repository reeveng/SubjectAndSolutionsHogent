package domein;

//SIMPLE FACTORY
public class ApplicationFactory {

    public static Application createApplication(String type) {
        switch (type) {
            case "drawing":
 //Uncomment
               return new DrawingApplication();
            case "statistics":
 //Uncomment
               return new StatisticsApplication();
            default:
                return null;
        }
    }
}
