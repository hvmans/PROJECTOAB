package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Objects;

public class Employee {

    private final String EMPLOYEE_TYPE_AGENT = "Agent";
    private final String EMPLOYEE_TYPE_AGENCY_MANAGER = "Agency manager";
    private final String EMPLOYEE_TYPE_SYSTEM_ADMINISTRATOR = "System Administrator";
    private final String EMPLOYEE_TYPE_NETWORK_ADMINISTRATOR = "Network administrator";
    private static int employeeIdcounter = 0;
    private int employeeId;
    private String employeeType;
    private String name;
    private int ccNumber;
    private int taxNumber;
    private final String employeeEmail;
    private int phoneNumber;

    public Employee(String employeeType, String name, int ccNumber, int taxNumber, String employeeEmail, int phoneNumber) {
        this.employeeType = employeeType;
        this.name = name;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.employeeEmail = employeeEmail;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return employeeEmail.equals(employee.employeeEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeEmail);
    }

    public boolean hasEmail(String email) {
        return this.employeeEmail.equals(email);
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

    public static int getEmployeeIdcounter() {
        return employeeIdcounter;
    }

    public int getEmployeeId() {
        return employeeId;
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

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
