package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.PublishAnnouncementController;
import pt.ipp.isep.dei.esoft.project.domain.Request;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PublishAnnouncmentUI implements  Runnable{

    PublishAnnouncementController announcementController  = new PublishAnnouncementController();

    @Override
    public void run()
    {
       displayAgentRequests();

    }

    private void displayAgentRequests() {
        List<Request> agentRequestList = announcementController.getAgentRequests(announcementController.getAgentEmailFromSession());
        System.out.println("Select your request");
        Collections.sort(agentRequestList, Comparator.comparing(Request::getRequestDate).reversed());

        for (Request request:agentRequestList) {
            System.out.println("date: "+request.getRequestDate()+"type"+request.getRequestType()+"id"+request.getRequestId());
        }
    }



    }
