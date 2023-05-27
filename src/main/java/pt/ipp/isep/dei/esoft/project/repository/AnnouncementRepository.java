package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.Announcement;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementRepository {

    private final List<Announcement> announcements = new ArrayList<>();

    public Announcement getAnnouncementById(int announcementId) {
        Announcement announcementToGet = null;
        for (Announcement announcement: announcements) {
            if (announcement.getAnnouncementId() == announcementId) {
                announcementToGet = announcement;
            }
        }
        return announcementToGet;
    }

    public void addAnnouncement(Announcement announcement) {
        announcements.add(announcement);
    }
}
