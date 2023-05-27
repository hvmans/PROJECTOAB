package pt.ipp.isep.dei.esoft.project.domain;

public class Announcement {
    private static int announcementIdCounter = 0;
    private int announcementId;

    private Commission agentCommission;
    Request requestForAnnouncement;

    public Announcement(Commission agentCommission, Request requestForAnnouncement) {
        this.agentCommission = agentCommission;
        this.requestForAnnouncement = requestForAnnouncement;
        this.announcementId = announcementIdCounter;
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
}
