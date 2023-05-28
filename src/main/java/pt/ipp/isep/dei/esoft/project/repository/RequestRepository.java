package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestRepository {

    private final List<Request> requests = new ArrayList<>();

    public List<Request> getRequests() {
        return requests;
    }

    public Request getRequestById(int requestId) {
        Request requestToGet = null;
        for (Request request: requests) {
            if (request.getRequestId() == requestId) {
                requestToGet = request;
            }
        }
        return requestToGet;
    }

    public void removeRequestById(int requestId) {
        for (Request request: requests) {
            if (request.getRequestId() == requestId) {
                requests.remove(request);
            }
        }
    }

    public void addRequest(Request requestToAdd) {
        requests.add(requestToAdd);
    }

    public List<Request> getAgentRequests(String agentEmail) {
        List<Request> agentRequests = new ArrayList<>();
        for (Request request: requests) {
            if (request.getRequestAgentEmail().equals(agentEmail)) {
                agentRequests.add(request);
            }
        }
        return agentRequests;
    }

    public boolean checkRequestById(int requestId) {
        boolean idChecked = false;
        for (Request request: requests) {
            if (request.getRequestId() == requestId) {
                idChecked = true;
            }
        }
        return idChecked;
    }
}
