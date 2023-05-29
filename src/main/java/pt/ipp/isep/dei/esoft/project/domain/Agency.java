package pt.ipp.isep.dei.esoft.project.domain;

import pt.isep.lei.esoft.auth.domain.model.Email;

public class Agency {

    private static int agencyIdCounter = 0;
    private int agencyId;
    private String agencyEmail;
    private String location;
    private int telephoneNumber;
    private Employee manager;

    public Agency(String agencyEmail, String location, int telephoneNumber, Employee manager) {
        this.agencyEmail = agencyEmail;
        this.location = location;
        this.telephoneNumber = telephoneNumber;
        this.manager = manager;
        this.agencyId = agencyIdCounter++;
    }

    public static int getAgencyIdCounter() {
        return agencyIdCounter;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public String getAgencyEmail() {
        return agencyEmail;
    }

    public void setAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
