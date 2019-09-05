package gui;

import domein.FilosofenBeheer;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class FilosofenFrameController extends BorderPane {

    @FXML
    private Button btnAddFilosoof;

    @FXML
    private Button btnRemoveFilosoof;

    @FXML
    private ListView<String> listFilosofen;
    private FilosofenBeheer domeinController;

    public FilosofenFrameController(FilosofenBeheer domeinController) {
        this.domeinController = domeinController;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FilosofenFrame.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @FXML
    private void addFilosoof(ActionEvent event) {
    }

    @FXML
    private void removeFilosoof(ActionEvent event) {
    }
}
