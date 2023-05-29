package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.domain.Agency;
import pt.ipp.isep.dei.esoft.project.domain.Employee;
import pt.ipp.isep.dei.esoft.project.repository.AgencyRepository;
import pt.ipp.isep.dei.esoft.project.repository.AuthenticationRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;

import java.util.List;

public class RegisterAgencyController {

    private AgencyRepository agencyRepository = null;
    private AuthenticationRepository authenticationRepository = null;

    private AgencyRepository getAgencyRepository() {
        if (agencyRepository == null) {
            Repositories repositories = Repositories.getInstance();
            agencyRepository = repositories.getAgencyRepository();
        }
        return agencyRepository;
    }

    private AuthenticationRepository getAuthenticationRepository() {
        if (authenticationRepository == null) {
            Repositories repositories = Repositories.getInstance();
            authenticationRepository = repositories.getAuthenticationRepository();
        }
        return authenticationRepository;
    }

    public void registerAgency(Agency agencyToRegister) {
        getAgencyRepository().addAgency(agencyToRegister);
    }

    public boolean checkAgencyManagerExistsByEmail(String agencyManagerEmail) {
        return getAuthenticationRepository().checkEmployeeExsitsByEmail(agencyManagerEmail);
    }

    public Employee getAgencyManagerByEmail(String agencyManagerEmail) {
        return getAuthenticationRepository().getEmployeeByEmail(agencyManagerEmail);

    }

}
