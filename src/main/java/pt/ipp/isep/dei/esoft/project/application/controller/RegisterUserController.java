package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.application.controller.authorization.AuthenticationController;
import pt.ipp.isep.dei.esoft.project.repository.AuthenticationRepository;
import pt.ipp.isep.dei.esoft.project.repository.Repositories;

public class RegisterUserController {

    private AuthenticationRepository authenticationRepository = null;

    public RegisterUserController() {
        getAuthenticationRepository();
    }

    private AuthenticationRepository getAuthenticationRepository() {
        if (authenticationRepository == null) {
            Repositories repositories = Repositories.getInstance();
            authenticationRepository = repositories.getAuthenticationRepository();
        }
        return authenticationRepository;
    }

    public void RegisterUser(String userName, String userEmail, String userPassword) {
        AuthenticationRepository authenticationRepository = getAuthenticationRepository();
        authenticationRepository.addUserWithRole(userName, userEmail, userPassword, AuthenticationController.ROLE_CLIENT);
    }
}
