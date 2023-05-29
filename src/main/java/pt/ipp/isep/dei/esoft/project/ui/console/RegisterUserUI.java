package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.RegisterUserController;
import pt.ipp.isep.dei.esoft.project.domain.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterUserUI implements Runnable {

    RegisterUserController registerUserController = new RegisterUserController();

    @Override
    public void run() {
        String userName = inputName();
        String userEmail = inputEmail();
        String password = inputPassword();
        registerUserController.RegisterUser(userName, userEmail, password);
    }

    public String inputName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your name: ");
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
        System.out.println("Type your email address: ");
        do {
            userEmail = scanner.next();
        } while (!isValidEmail(userEmail));
        return userEmail;
    }
    /**
     * Email validiation , email need to have A-Z can or not contain a number a  @ and A-Z  letter can or not contain a number  ,
     */

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public String inputPassword() {
        return "pwd";
    }




}
