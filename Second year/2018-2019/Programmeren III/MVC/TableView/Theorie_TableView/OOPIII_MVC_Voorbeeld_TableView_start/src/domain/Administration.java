package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Administration {

    private ObservableList<Person> personList;

    //Voorbeeld zonder databank
    private static final List<Person> data = new ArrayList<>(Arrays.asList(new Person[]{
        new Person("Jacob", "Smith", "jacob.smith@example.com"),
        new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
        new Person("Ethan", "Williams", "ethan.williams@example.com"),
        new Person("Emma", "Jones", "emma.jones@example.com"),
        new Person("Michael", "Brown", "michael.brown@example.com")}
    ));

    public Administration() {
        personList = FXCollections.observableArrayList(data);
    }

    public ObservableList<Person> getPersonList() {
        return FXCollections.unmodifiableObservableList(personList);
    }

    public void addPerson(String firstName, String lastName, String email) {
        personList.add(new Person(firstName, lastName, email));
    }

    public void editFirstName(int index, String newFirstName) {
       personList.get(index).setFirstName(newFirstName);
    }

}
