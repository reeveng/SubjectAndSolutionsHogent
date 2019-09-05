package gui;

import domein.DomeinController;
import domein.Klant;
import java.util.Observer;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class DetailKlantPaneel extends GridPane  {

    private final DomeinController dc;

    private TextField[] txfInfo;
    private final String[] info = {"Naam", "Voornaam", "GSM"};
    private Button btnVoegToe, btnAnnuleer;

    public DetailKlantPaneel(DomeinController dc) {
        this.dc = dc;
        buildGui();
    }

    private void buildGui() {
        this.setMinWidth(300);
        this.setPadding(new Insets(30, 5, 30, 5));
        this.setHgap(5);
        this.setVgap(20);

        txfInfo = new TextField[info.length];
        int rijnr = 0;
        for (String gegeven : info) {
            this.add(new Label(gegeven), 0, rijnr);
            txfInfo[rijnr] = new TextField();
            this.add(txfInfo[rijnr], 1, rijnr);
            rijnr++;
        }

        btnVoegToe = new Button("Voeg toe");
        this.add(btnVoegToe, 0, rijnr);
        btnAnnuleer = new Button("Annuleer");
        this.add(btnAnnuleer, 1, rijnr);
    }

    public void toonGegevens(String[] gegs) {
        btnVoegToe.setDisable(true);
        btnAnnuleer.setDisable(true);
        int i = 0;
        for (String geg : gegs) {
            txfInfo[i].setEditable(false);
            txfInfo[i++].setText(geg);
        }
    }

    private void toonFout(String boodschap) {
        Alert foutboodschap = new Alert(AlertType.ERROR);
        foutboodschap.setContentText(boodschap);
        foutboodschap.show();
    }


}
