package pt.ipp.isep.dei.esoft.project.domain;
import pt.isep.lei.esoft.auth.domain.model.Email;


/**
 * The type Owner.
 */
public class Owner {
    private static int ownerIdCounter = 0;
    private int ownerId;
    private String name;
    private int ccNumber;
    private int taxNumber;
    private final Email ownerEmail;
    private int phoneNumber;

    public Owner(String name, int ccNumber, int taxNumber, Email ownerEmail, int phoneNumber) {
        this.name = name;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.ownerEmail = ownerEmail;
        this.phoneNumber = phoneNumber;
        this.ownerId = ownerIdCounter++;
    }

    public static int getOwnerIdCounter() {
        return ownerIdCounter;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public Email getOwnerEmail() {
        return ownerEmail;
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