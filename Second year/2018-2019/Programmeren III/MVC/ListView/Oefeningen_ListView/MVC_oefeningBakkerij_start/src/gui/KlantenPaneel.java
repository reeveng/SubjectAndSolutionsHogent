package gui;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class KlantenPaneel extends VBox {

    private final DomeinController dc;
    private ListView<String> lstvKlanten;

    public KlantenPaneel(DomeinController dc) {
        this.dc = dc;
        buildGui();
    }

    private void buildGui() {
        this.setMaxWidth(300);
        this.setPadding(new Insets(25));
        this.setSpacing(10);
        lstvKlanten = new ListView<>();
        this.getChildren().add(lstvKlanten);
      
    }


}
