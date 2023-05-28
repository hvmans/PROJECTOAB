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

    public void addRequest(Request requestToAdd) {
        requests.add(requestToAdd);
    }
}
