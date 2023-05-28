package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Date;

public class Request {

    private final String REQUEST_TYPE_SALE = "Sale";
    private final String REQUEST_TYPE_LEASE = "Lease";
    private static int requestIdCounter = 1;
    private int requestId;
    String requestType;
    Property requestedProperty;
    Employee requestAgent;
    Date requestDate;

    public Request(String requestType, Property requestedProperty, Employee requestAgent) {
        this.requestType = requestType;
        this.requestedProperty = requestedProperty;
        this.requestAgent = requestAgent;
        this.requestId = requestIdCounter++;
        this.requestDate = new Date();
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public static int getRequestIdCounter() {
        return requestIdCounter;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Property getRequestedProperty() {
        return requestedProperty;
    }

    public void setRequestedProperty(Property requestedProperty) {
        this.requestedProperty = requestedProperty;
    }

    public void setRequestAgent(Employee requestAgent) {
        this.requestAgent = requestAgent;
    }

    public String getRequestAgentEmail() {
        return this.requestAgent.getEmployeeEmail();
    }
}
