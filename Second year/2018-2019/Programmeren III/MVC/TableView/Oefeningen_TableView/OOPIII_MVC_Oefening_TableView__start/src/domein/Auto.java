package domein;

public class Auto {

    //private final                       nummerplaat 
    //private final                        merk
    //private final                        model 
    
    public Auto(String nummerplaat, String merk, String model) {
        setNummerplaat(nummerplaat);
        setMerk(merk);
        setModel(model);
    }

    private void setNummerplaat(String nrplaat) {
        //nummerplaat
    }

   /*public String getNummerplaat() {
        return nummerplaat
    }

    public                     nummerplaatProperty() {
        return nummerplaat;
    }*/

    private void setMerk(String merk) {
        //this.merk
    }

    /*public String getMerk() {
        return merk.get();
    }

    public StringProperty merkProperty() {
        return merk;
    }
    */
    private void setModel(String model) {
        //this.model.set(model);
    }

    /*public String getModel() {
        return model.get();
    }

    public StringProperty modelProperty() {
        return model;
    }

    @Override
    public String toString() {
        return String.format(
                "nummerplaat= %s, merk= %s, model = %s", nummerplaat, merk, model);
    }*/
}
