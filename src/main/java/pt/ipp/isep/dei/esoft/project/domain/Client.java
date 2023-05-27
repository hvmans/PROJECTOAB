package pt.ipp.isep.dei.esoft.project.domain;

import pt.isep.lei.esoft.auth.domain.model.Email;

public class Client {

    private static int clientIdCounter = 0;
    private String name;
    private int clientId;
    private int ccNumber;
    private int taxNumber;
    private final Email clientEmail;
    private int phoneNumber;

    public Client(String name, int ccNumber, int taxNumber, Email clientEmail, int phoneNumber) {
        this.name = name;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.clientId = clientIdCounter++;
    }

    public static int getClientIdCounter() {
        return clientIdCounter;
    }

    public String getName() {
        return name;
    }

    public int getClientId() {
        return clientId;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public Email getClientEmail() {
        return clientEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

