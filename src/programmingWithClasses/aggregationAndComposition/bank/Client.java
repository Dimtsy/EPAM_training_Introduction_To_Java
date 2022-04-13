package programmingWithClasses.aggregationAndComposition.bank;

import java.util.ArrayList;

public class Client {
    private int clientId;
    private String name;
    private String lastName;
    private ArrayList<Account> clientAccounts;

    public Client(int clientId, String name, String lastName, ArrayList<Account> clientAccounts) {
        this.clientId = clientId;
        this.name = name;
        this.lastName = lastName;
        this.clientAccounts = clientAccounts;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getClientAccounts() {
        return clientAccounts;
    }

    public void setClientAccounts(ArrayList<Account> clientAccounts) {
        this.clientAccounts = clientAccounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", clientAccounts=" + clientAccounts +
                '}';
    }
}
