package domein;

import javafx.collections.ObservableList;
import persistentie.PersistentieController;

public class FilosofenBeheer {

    private ObservableList<String> filosofen;
    private PersistentieController persistentieController = new PersistentieController();

    public FilosofenBeheer() {
        //TODO
        // filosofen = 
    }

    public ObservableList<String> getFilosofen() {
        //TODO
        return filosofen;
    }

    public boolean noFilosofen() {
        return filosofen.isEmpty();
    }

    public void addFilosoof(String naam) {
        if (naam != null && !naam.trim().isEmpty()) {
            filosofen.add(naam);
        }
    }

    public void removeFilosoof(String naam) {

        filosofen.remove(naam);
    }
    
    /*
    public void addObserver(ListChangeListener<String> listener)
    {
      //TODO
    }*/

}
