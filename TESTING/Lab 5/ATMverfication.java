/* State Transision 
Write a Java program that simulates an ATM PIN verification system.
    ● The user has 3 attempts to enter the correct PIN.
    ● If the correct PIN (say 1234) is entered, display “Access Granted”.
    ● If all 5 attempts are incorrect, display “Card Blocked”.*/

import java.util.Scanner;

public class ATMverfication {
    public static void main(String[] args) {
        final String correctPin = "1234";
        final int max_attepms = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("State: Start");

        int attempts = 0;

        while (attempts < max_attepms) {

            System.out.println("\nPIN Attempt: " + (attempts + 1));

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();

            if (pin.equals(correctPin)) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Incorrect PIN");
                attempts++;

                if (attempts == max_attepms) {
                    System.out.println("Card Blocked");
                }
            }
        }

        sc.close();

    }

}