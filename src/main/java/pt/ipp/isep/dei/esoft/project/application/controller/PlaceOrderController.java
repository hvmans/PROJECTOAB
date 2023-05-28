package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.domain.Announcement;
import pt.ipp.isep.dei.esoft.project.domain.Request;
import pt.ipp.isep.dei.esoft.project.repository.AnnouncementRepository;
import pt.ipp.isep.dei.esoft.project.repository.AuthenticationRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;

public class PlaceOrderController {

    private AuthenticationRepository authenticationRepository = null;
    private AnnouncementRepository announcementRepository = null;

    private AuthenticationRepository getAuthenticationRepository() {
        if (authenticationRepository == null) {
            Repositories repositories = Repositories.getInstance();
            authenticationRepository = repositories.getAuthenticationRepository();
        }
        return authenticationRepository;
    }
    private AnnouncementRepository getAnnouncementRepository() {
        if (announcementRepository == null) {
            Repositories repositories = Repositories.getInstance();
            announcementRepository = repositories.getAnnouncementRepository();
        }
        return announcementRepository;
    }
    public Announcement getAnnouncementById(int announcementId) {    // not getting , we are getting/locating announcment by its id
        return getAnnouncementRepository().getAnnouncementById(announcementId);
    }
    public  double  getAnnouncmentPrice(int announcmentId){
        return getAnnouncementById(announcmentId).getAnnoucementPrice();
    }



}
