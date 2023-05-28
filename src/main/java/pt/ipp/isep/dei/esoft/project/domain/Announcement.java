package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Date;

public class Announcement {
    private static int announcementIdCounter = 0;
    private int announcementId;
    private Commission agentCommission;
    private Request requestForAnnouncement;
    private Date announcementDate;

    public Announcement(Commission agentCommission, Request requestForAnnouncement) {
        this.agentCommission = agentCommission;
        this.requestForAnnouncement = requestForAnnouncement;
        this.announcementId = announcementIdCounter;
        this.announcementDate = new Date();
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
}
