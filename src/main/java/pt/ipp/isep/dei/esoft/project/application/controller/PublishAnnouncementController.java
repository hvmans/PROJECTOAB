package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.domain.Announcement;
import pt.ipp.isep.dei.esoft.project.domain.Employee;
import pt.ipp.isep.dei.esoft.project.domain.Request;
import pt.ipp.isep.dei.esoft.project.repository.AnnouncementRepository;
import pt.ipp.isep.dei.esoft.project.repository.AuthenticationRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;
import pt.ipp.isep.dei.esoft.project.repository.RequestRepository;
import pt.isep.lei.esoft.auth.domain.model.Email;

import java.util.List;

public class PublishAnnouncementController {

    private AuthenticationRepository authenticationRepository = null;
    private RequestRepository requestRepository = null;
    private AnnouncementRepository announcementRepository = null;

    private AuthenticationRepository getAuthenticationRepository() {
        if (authenticationRepository == null) {
            Repositories repositories = Repositories.getInstance();
            authenticationRepository = repositories.getAuthenticationRepository();
        }
        return authenticationRepository;
    }

    private RequestRepository getRequestRepository() {
        if (requestRepository == null) {
            Repositories repositories = Repositories.getInstance();
            requestRepository = repositories.getRequestRepository();
        }
        return requestRepository;
    }

    private AnnouncementRepository getAnnouncementRepository() {
        if (announcementRepository == null) {
            Repositories repositories = Repositories.getInstance();
            announcementRepository = repositories.getAnnouncementRepository();
        }
        return announcementRepository;
    }

    public Request getRequestById(int requestId) {
        return getRequestRepository().getRequestById(requestId);
    }

    public String getAgentEmailFromSession() {
        Email email = getAuthenticationRepository().getCurrentUserSession().getUserId();
        return email.getEmail();
    }

    public Employee getAgentFromSession() {
        return new Employee(getAgentEmailFromSession());
    }

    public List<Request> getRequests() {
        return getRequestRepository().getRequests();
    }

    public void removeRequestById(int requestId) {
        getRequestRepository().removeRequestById(requestId);
    }

    public void publishAnnouncement(Announcement announcement) {
        AnnouncementRepository announcementRepository = getAnnouncementRepository();
        announcementRepository.addAnnouncement(announcement);
    }

    public List<Request> getAgentRequests(String agentEmail) {
        RequestRepository requestRepository = getRequestRepository();
        return requestRepository.getAgentRequests(agentEmail);
    }

    public boolean checkRequestId(int requestId) {
        RequestRepository requestRepository = getRequestRepository();
        return requestRepository.checkRequestById(requestId);
    }
}
