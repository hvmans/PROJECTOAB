package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.Agency;

import java.util.ArrayList;
import java.util.List;

public class AgencyRepository {

    private final List<Agency> agencies = new ArrayList<>();

    public Agency getAgencyById(int agencyId) {
        Agency agencyToReturn = null;
        for (Agency agency: agencies) {
            if (agency.getAgencyId() == agencyId) {
                agencyToReturn = agency;
            }
        }
        return agencyToReturn;
    }

    public void addAgency(Agency agencyToAdd) {
        agencies.add(agencyToAdd);
    }
}
