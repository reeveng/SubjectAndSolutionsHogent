package gui;

import domein.DomeinController;
import java.util.Observable;
import java.util.Observer;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class HoofdScherm extends BorderPane  {

    private KlantenPaneel klantenPaneel;
    private ListView<String> lstvBestellingen;
    private DetailKlantPaneel dtlp;
    private final DomeinController dc;

    public HoofdScherm(DomeinController dc) {
        this.dc = dc;
        buildGui();
    }

    private void buildGui() {
        this.setPadding(new Insets(25));

        klantenPaneel = new KlantenPaneel(dc);
        this.setLeft(klantenPaneel);

        lstvBestellingen = new ListView<>();
        this.setCenter(lstvBestellingen);

        dtlp = new DetailKlantPaneel(dc);
        this.setRight(dtlp);

        
    }

    
}
