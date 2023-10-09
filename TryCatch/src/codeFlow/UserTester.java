package codeFlow;

import java.util.Scanner;

public class UserTester {
    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);
        boolean isUsernameValid = false;
        System.out.println("Welcome. Please enter a username");
        String username = scanner.nextLine();
        isUsernameValid = DataValidator.isUserNameValid(username);
        boolean isPasswordValid = false;
        System.out.println("Please enter a password");
        String password = scanner.nextLine();
        isPasswordValid = DataValidator.isPasswordValid(password);
        User u1;
        if (isUsernameValid && isPasswordValid) {
            u1 = new User(username, password);
        } else {
            System.out.println("Username or password is not valid");
        }*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome. Please enter a username");
        String username = scanner.nextLine();

        System.out.println("Please enter a password");
        String password = scanner.nextLine();

        User u1;
        try {
            u1 = new User(username, password);
        } catch (IllegalArgumentException e) {
            System.out.println("Your input is not valid. Please try again");
        }


    }

}

