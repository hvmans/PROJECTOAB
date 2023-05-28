package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.PublishAnnouncementController;
import pt.ipp.isep.dei.esoft.project.domain.Announcement;
import pt.ipp.isep.dei.esoft.project.domain.Commission;
import pt.ipp.isep.dei.esoft.project.domain.Request;

import java.util.*;

public class PublishAnnouncementUI implements Runnable {

    PublishAnnouncementController announcementController = new PublishAnnouncementController();

    @Override
    public void run() {
        displayAgentRequests();
        int requestId = getRequestId();
        Request requestForAnnouncement = announcementController.getRequestById(requestId);
        Commission agentCommission = getAgentComission();
        announcementController.publishAnnouncement(new Announcement(agentCommission, requestForAnnouncement));
        announcementController.removeRequestById(requestId);
        System.out.println();
        System.out.println("The announcement was published with success.");

    }

    private void displayAgentRequests() {
        List<Request> agentRequestList = announcementController.getAgentRequests(announcementController.getAgentEmailFromSession());
        System.out.println("Select your request: ");
        Collections.sort(agentRequestList, Comparator.comparing(Request::getRequestDate).reversed());
        for (Request request : agentRequestList) {
            System.out.println("date: " + request.getRequestDate() + " type: " + request.getRequestType() + " id: " + request.getRequestId());
        }
    }

    public Commission getAgentComission() {
        Commission commission = new Commission();
        Scanner scn = new Scanner(System.in);
        int comissionType = 0;
        System.out.println("Select the type of commission you want: ");
        do {
            System.out.println("1 - Fix comission");
            System.out.println("2 - Percentage comission");
            comissionType = scn.nextInt();
        } while (comissionType < 1 || comissionType > 2);
        if (comissionType == 1) {
            commission.setCommissionTypeFixed();
            commission.setValue(getFixComission());
        } else {
            commission.setCommissionTypePercentage();
            commission.setValue(getPercentComission());
        }
        return commission;
    }

    public double getFixComission() {
        Scanner scn = new Scanner(System.in);
        double comission = 0;
        boolean passed;
        System.out.println("Type the value for your comission");
        do {
            passed = true;
            try {
                comission = scn.nextDouble();
                if (comission <= 0) {
                    passed = false;
                    System.out.println("Commission should be positive, type again.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("That is not a valid commission, type again.");
                passed = false;
                scn.next();
            }
        } while (!passed);
        return comission;
    }

    public double getPercentComission() {
        Scanner scn = new Scanner(System.in);
        double comission = 0;
        boolean valid;
        System.out.println("Type the value for your comission: ");
        do {
            valid = true;
            try {
                comission = scn.nextDouble();
                if (comission < 0 || comission > 100) {
                    System.out.println("Invalid number, the commision should be a percentage value");
                    valid = false;
                }
            } catch (InputMismatchException exception) {
                System.out.println("That is not a valid commission, type again.");
                valid = false;
                scn.next();
            }
        } while (!valid);
        return comission;
    }

    public int getRequestId() {
        Scanner keyboardScanner = new Scanner(System.in);
        int requestId = 0;
        boolean passed, isValid;
        System.out.println("Introduce the request id: ");
        do {
            passed = true;
            isValid = true;
            try {
                requestId = keyboardScanner.nextInt();
                if (!announcementController.checkRequestId(requestId)) {
                    System.out.println("That request doesn't exist in the repository, try again.");
                    passed = false;
                    isValid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("That input is not valid, try again.");
                passed = false;
                isValid = false;
                keyboardScanner.next();
            }
        } while (!isValid && !passed);
        return requestId;
    }


}
