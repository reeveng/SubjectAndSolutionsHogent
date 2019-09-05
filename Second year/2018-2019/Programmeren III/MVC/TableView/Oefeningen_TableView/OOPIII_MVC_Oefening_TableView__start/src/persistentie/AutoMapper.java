package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Auto;

public class AutoMapper {

    public List<Auto> geefAutos() {
        List<Auto> lijstAutos = new ArrayList<>();
        lijstAutos.add(new Auto("1-GHJ-562", "Toyota", "Yaris"));
        lijstAutos.add(new Auto("1-LKS-254", "Opel", "Astra"));
        lijstAutos.add(new Auto("1-ZDF-874", "BMW", "Berline"));
        lijstAutos.add(new Auto("1-JSK-235", "Toyota", "Avensis"));
        lijstAutos.add(new Auto("1-ELS-685", "Mercedes", "C-klasse Berline"));
        lijstAutos.add(new Auto("1-QSP-222", "Renault", "Fluence"));
        lijstAutos.add(new Auto("1-ZER-988", "Opel", "Zafira"));
        lijstAutos.add(new Auto("1-MNB-918", "Lexus", "NX"));
        lijstAutos.add(new Auto("1-URR-514", "Toyota", "Avensis"));
        lijstAutos.add(new Auto("1-IQK-921", "Toyota", "Prius"));
        lijstAutos.add(new Auto("1-TTA-421", "Renault", "Fluence"));
        lijstAutos.add(new Auto("1-JFG-254", "Toyota", "Prius"));
        lijstAutos.add(new Auto("1-TWV-924", "Peugeot", "308"));
        lijstAutos.add(new Auto("1-RXW-842", "Honda", "CR-Z"));
        lijstAutos.add(new Auto("1-PQL-287", "Hyundai", "Genesis"));
        return lijstAutos;
    }
}
