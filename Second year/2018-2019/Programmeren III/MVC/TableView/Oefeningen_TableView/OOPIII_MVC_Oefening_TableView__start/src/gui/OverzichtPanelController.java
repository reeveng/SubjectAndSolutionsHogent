package gui;

import domein.Garage;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class OverzichtPanelController extends BorderPane {

    @FXML
    private TextField txtVanMerk;
    
    @FXML
    private TextField txtTotMerk;

    private Garage domeinController;

    public OverzichtPanelController(Garage domeinController) {
        this.domeinController = domeinController;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OverzichtPanel.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    @FXML
    private void filter(KeyEvent event) {
    }

}
