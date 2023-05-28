package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Date;

public class Announcement {
    private static int announcementIdCounter = 0;
    private int announcementId;
    private double order; // must be equal or lower than the announcement price which is in the request
    private Commission agentCommission;
    private Request requestForAnnouncement;
    private Date announcementDate;

    public Announcement(Commission agentCommission, Request requestForAnnouncement) {
        this.agentCommission = agentCommission;
        this.requestForAnnouncement = requestForAnnouncement;
        this.announcementId = announcementIdCounter;
        this.announcementDate = new Date();
        this.order = requestForAnnouncement.getPrice();
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }


    public void setAgentCommission(Commission agentCommission) {
        this.agentCommission = agentCommission;
    }

    public Commission getAgentCommission() {
        return agentCommission;
    }

    public Request getRequestForAnnouncement() {
        return requestForAnnouncement;
    }

    public static int getAnnouncementIdCounter() {
        return announcementIdCounter;
    }

    public int getAnnouncementId() {
        return announcementId;
    }

    public Date getAnnouncementDate() {
        return announcementDate;
    }

    public double getAnnoucementPrice(){return requestForAnnouncement.getPrice();} //getting price from the request no

}
