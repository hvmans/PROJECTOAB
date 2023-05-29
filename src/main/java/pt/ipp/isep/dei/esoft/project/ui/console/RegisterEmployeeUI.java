package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.RegisterEmployeeController;
import pt.ipp.isep.dei.esoft.project.application.controller.authorization.AuthenticationController;
import java.util.Scanner;

public class RegisterEmployeeUI implements Runnable {

    RegisterEmployeeController registerEmployeeController = new RegisterEmployeeController();

    @Override
    public void run() {
        String name = inputName();
        String email = inputEmail();
        String password = inputPassword();
        String employeeRole = inputEmployeeRole();
        registerEmployeeController.RegisterEmployee(name, email, password, employeeRole);
        System.out.println("The employee was registered with success!");
    }

    public String inputName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the employee's name: ");
        do {
            name = scanner.nextLine();
            if (!validateName(name)) {
                System.out.println("That's not a valid name.");
            }
        } while (!validateName(name));
        return name;
    }

    public boolean validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            return false;
        }
        return true;
    }

    public String inputEmail() {
        String userEmail;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the employee's email address: ");
        do {
            userEmail = scanner.next();
        } while (!isValidEmail(userEmail));
        return userEmail;
    }

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public String inputPassword() {
        return "pwd";
    }

    public String inputEmployeeRole() {
        Scanner scanner = new Scanner(System.in);
        String employeeRole;
        do {
            System.out.print("Enter the employee role: ");
            employeeRole = scanner.nextLine();

            if (validateEmployeeRole(employeeRole)) {
                break;
            } else {
                System.out.println("Invalid input! The available roles are agent, agency manager, system administrator and network manager.");
            }
        } while (true);
        return employeeRole;
    }

    public boolean validateEmployeeRole(String employeeRole) {
        String[] validWords = {AuthenticationController.ROLE_AGENT, AuthenticationController.ROLE_AGENCY_MANAGER, AuthenticationController.ROLE_SYSTEM_ADMINISTRATOR, AuthenticationController.ROLE_NETWORK_MANAGER};

        for (String word : validWords) {
            if (employeeRole.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }


}
