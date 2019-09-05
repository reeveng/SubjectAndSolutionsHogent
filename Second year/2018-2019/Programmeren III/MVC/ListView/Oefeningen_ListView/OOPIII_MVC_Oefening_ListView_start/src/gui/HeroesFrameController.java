package gui;

import domein.HeroWorld;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HeroesFrameController extends GridPane {

    @FXML
    private Button btnSendRight;

    @FXML
    private Button btnSendLeft;

    private final HeroWorld domeinController;

    public HeroesFrameController(HeroWorld domeinController) {
        this.domeinController = domeinController;

        FXMLLoader loader = new FXMLLoader(getClass().
                getResource("HeroesFrame.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    @FXML
    private void sendRight(ActionEvent event) {

    }


    @FXML
    private void sendLeft(ActionEvent event) {

        
    }


}
