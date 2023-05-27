package pt.ipp.isep.dei.esoft.project.domain;

public class Request {

    private final String REQUEST_TYPE_SALE = "Sale";
    private final String REQUEST_TYPE_LEASE = "Lease";
    private static int requestIdCounter = 0;
    private int requestId;
    String requestType;
    Property requestedProperty;
    Employee agent;

    public Request(String requestType, Property requestedProperty, Employee agent) {
        this.requestType = requestType;
        this.requestedProperty = requestedProperty;
        this.agent = agent;
        this.requestId = requestIdCounter++;
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

    public Employee getAgent() {
        return agent;
    }

    public void setAgent(Employee agent) {
        this.agent = agent;
    }
}
