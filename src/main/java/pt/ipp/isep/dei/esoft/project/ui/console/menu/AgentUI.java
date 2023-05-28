package pt.ipp.isep.dei.esoft.project.ui.console.menu;

import pt.ipp.isep.dei.esoft.project.application.controller.PublishAnnouncementController;
import pt.ipp.isep.dei.esoft.project.domain.Apartment;
import pt.ipp.isep.dei.esoft.project.domain.House;
import pt.ipp.isep.dei.esoft.project.domain.Request;
import pt.ipp.isep.dei.esoft.project.repository.RequestRepository;
import pt.ipp.isep.dei.esoft.project.ui.console.PublishAnnouncementUI;
import pt.ipp.isep.dei.esoft.project.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class AgentUI implements Runnable {
    @Override
    public void run() {
        addAgentRequests();
        List<MenuItem> options = new ArrayList<MenuItem>();
        options.add(new MenuItem("Publish An Announcement", new PublishAnnouncementUI())); // us 002 function amd 009 function combined


        int option = 0;
        do {
            option = Utils.showAndSelectIndex(options, "\n\nAgent Menu:");

            if ((option >= 0) && (option < options.size())) {
                options.get(option).run();
            }
        } while (option != -1);
    }

    private void addAgentRequests() {
        PublishAnnouncementController publishAnnouncementController = new PublishAnnouncementController();
        Apartment apartment = new Apartment();
        House house = new House();
        Request request1 = new Request(1, "Sale", apartment, publishAnnouncementController.getAgentFromSession());
        publishAnnouncementController.getRequests().add(request1);
        Request request2 = new Request(1, "Lease", house, publishAnnouncementController.getAgentFromSession());
        publishAnnouncementController.getRequests().add(request2);
    }
}
