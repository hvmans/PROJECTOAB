package pt.ipp.isep.dei.esoft.project.ui.console;

import java.util.Scanner;

public class RegisterUserUI implements Runnable {
    @Override
    public void run() {
        requestData();
    }

    public void requestData() {
        inputName();
    }

    public void inputName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        do {
            name = scanner.nextLine();
            if (!validateName(name)) {
                System.out.println("That's not a valid name.");
            }
        } while (!validateName(name));
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


    public static boolean validateNineDigitInt(int number) {
        String numberString = String.valueOf(number);

        if (numberString.length() != 9) {
            return false;
        }

        try {
            Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
