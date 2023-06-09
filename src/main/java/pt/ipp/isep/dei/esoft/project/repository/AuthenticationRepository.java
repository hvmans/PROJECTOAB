package pt.ipp.isep.dei.esoft.project.repository;


import pt.ipp.isep.dei.esoft.project.domain.Employee;
import pt.isep.lei.esoft.auth.AuthFacade;
import pt.isep.lei.esoft.auth.UserSession;
import pt.isep.lei.esoft.auth.mappers.dto.UserDTO;

import java.util.Optional;

public class AuthenticationRepository {


    private final AuthFacade authenticationFacade = new AuthFacade();

    public boolean doLogin(String email, String pwd) {
        return authenticationFacade.doLogin(email, pwd).isLoggedIn();
    }

    public void doLogout() {
        authenticationFacade.doLogout();
    }

    public UserSession getCurrentUserSession() {
        return authenticationFacade.getCurrentUserSession();
    }

    public boolean addUserRole(String id, String description) {
        return authenticationFacade.addUserRole(id, description);
    }

    public boolean addUserWithRole(String name, String email, String pwd, String roleId) {
        return authenticationFacade.addUserWithRole(name, email, pwd, roleId);
    }

    public boolean checkEmployeeExsitsByEmail(String employeeEmail) {
        return authenticationFacade.existsUser(employeeEmail);
    }

    public Employee getEmployeeByEmail(String employeeEmail) {
        UserDTO employee = authenticationFacade.getUser(employeeEmail).orElseThrow(() -> new RuntimeException("User not found"));
        return new Employee(employee.getId());
    }



}
