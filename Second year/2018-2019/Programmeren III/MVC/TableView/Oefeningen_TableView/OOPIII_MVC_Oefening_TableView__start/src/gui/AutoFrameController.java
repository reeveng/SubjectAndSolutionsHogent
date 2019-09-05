package gui;

import domein.Garage;
import javafx.scene.layout.HBox;

public class AutoFrameController extends HBox {

    private OverzichtPanelController overzichtPanel;
    //private DetailPanelController detailPanelController;

    private Garage domeinController;

    public AutoFrameController(Garage domeinController) {
        this.domeinController = domeinController;
        overzichtPanel = new OverzichtPanelController(domeinController);
        
        //detailPanelController = new DetailPanelController();
        
        getChildren().addAll(overzichtPanel);
        //getChildren().addAll(overzichtPanel, detailPanelController);
    }

}
