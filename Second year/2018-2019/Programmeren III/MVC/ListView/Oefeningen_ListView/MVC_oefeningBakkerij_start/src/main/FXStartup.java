package main;

import domein.DomeinController;
import gui.HoofdScherm;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXStartup extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HoofdScherm sws = new HoofdScherm(new DomeinController());
        Scene scene = new Scene(sws, 1500, 600);        
               
        primaryStage.setTitle("Overzicht klanten bestellingen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
