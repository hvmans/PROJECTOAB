package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.repository.AuthenticationRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;

public class RegisterEmployeeController {
    private AuthenticationRepository authenticationRepository = null;

    private AuthenticationRepository getAuthenticationRepository() {
        if (authenticationRepository == null) {
            Repositories repositories = Repositories.getInstance();
            authenticationRepository = repositories.getAuthenticationRepository();
        }
        return authenticationRepository;
    }

    public void RegisterEmployee(String userName, String userEmail, String userPassword, String role) {
        AuthenticationRepository authenticationRepository = getAuthenticationRepository();
        authenticationRepository.addUserWithRole(userName, userEmail, userPassword, role);
    }
}
