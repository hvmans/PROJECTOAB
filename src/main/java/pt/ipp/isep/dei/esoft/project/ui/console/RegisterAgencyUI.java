package pt.ipp.isep.dei.esoft.project.ui.console;

import com.sun.security.jgss.GSSUtil;
import pt.ipp.isep.dei.esoft.project.application.controller.RegisterAgencyController;
import pt.ipp.isep.dei.esoft.project.domain.Agency;
import pt.ipp.isep.dei.esoft.project.domain.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterAgencyUI implements Runnable {

    RegisterAgencyController registerAgencyController = new RegisterAgencyController();
    @Override
    public void run() {
        String agencyEmail = inputEmail();
        String agencyLocation = inputLocation();
        int agencyTelephoneNumber = inputNumber();
        Employee agencyManager = inputAgencyManagerEmail();
        registerAgencyController.registerAgency(new Agency(agencyEmail, agencyLocation, agencyTelephoneNumber, agencyManager));
    }

    public String inputEmail() {
        String userEmail;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the agency email address: ");
        do {
            userEmail = scanner.next();
        } while (!isValidEmail(userEmail));
        return userEmail;
    }

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public String inputLocation() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the agency location: ");
        do {
            name = scanner.nextLine();
            if (!validateLocation(name)) {
                System.out.println("That's not a valid location.");
            }
        } while (!validateLocation(name));
        return name;
    }

    public boolean validateLocation(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            return false;
        }
        return true;
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = readValidNumber(scanner);
        return number;
    }

    private int readValidNumber(Scanner scanner) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Enter the agency telephone number: ");
                number = scanner.nextInt();
                isValid = validateNumber(number);
                if (!isValid) {
                    System.out.println("The number must be 9 digits long.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        return number;
    }

    private boolean validateNumber(int number) {
        String numberString = Integer.toString(number);
        return numberString.length() == 9;
    }

    public Employee inputAgencyManagerEmail() {
        Scanner scanner = new Scanner(System.in);
        String agencyManagerEmail = null;
        boolean agencyManagerIsValid = false;
        while (!agencyManagerIsValid) {
            System.out.println("Introduce the agency manager email: ");
            agencyManagerEmail = scanner.next();
            if (!registerAgencyController.checkAgencyManagerExistsByEmail(agencyManagerEmail) || !isValidEmail(agencyManagerEmail)) {
                System.out.println("Either the agency manager is not registered or your email is invalid, try again");
            } else {
                agencyManagerIsValid = true;
            }
        }
        return registerAgencyController.getAgencyManagerByEmail(agencyManagerEmail);
    }

}
