package domain;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Account  {

    // Account balance
    private double balance;

    // readonly Account name
    private String name;

    private PropertyChangeSupport subject;
    
    // Account constructor
    public Account(String accountName, double openingDeposit) {
        name = accountName;
        subject = new PropertyChangeSupport(this);
        setBalance(openingDeposit);
    }

    // set Account balance and notify observers of change
    private void setBalance(double accountBalance) {
        // notify Observers that model has changed
        subject.firePropertyChange("balance", this.balance, accountBalance);
        
        balance = accountBalance; 
    }

    // get Account balance
    public double getBalance() {
        return balance;
    }

    // withdraw funds from Account
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Cannot withdraw negative amount");
        }

        // update Account balance
        setBalance(getBalance() - amount);
    }

    // deposit funds in account
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }

        // update Account balance
        setBalance(getBalance() + amount);
    }

    // get Account name (readonly)
    public String getName() {
        return name;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        subject.addPropertyChangeListener(pcl);
        pcl.propertyChange(new PropertyChangeEvent(pcl, "balance", null, balance));
    }
 
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        subject.removePropertyChangeListener(pcl);
    }

}
