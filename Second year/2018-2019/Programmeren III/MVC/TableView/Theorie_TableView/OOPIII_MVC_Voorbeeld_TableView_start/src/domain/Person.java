package domain;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private final SimpleStringProperty firstName = new SimpleStringProperty();
    private final SimpleStringProperty lastName = new SimpleStringProperty();
    private final SimpleStringProperty email = new SimpleStringProperty();

    public Person(String fName, String lName, String email) {
        setFirstName(fName);
        setLastName(lName);
        setEmail(email);
    }

    protected void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    private void setLastName(String lName) {
        lastName.set(lName);
    }
    
    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    private void setEmail(String email) {
        this.email.set(email);
    }
    
    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

}
