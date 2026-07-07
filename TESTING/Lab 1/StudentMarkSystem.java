
/* Lab Task 1
Write a Java program for a Student Marks System that performs the following tasks:
    Create a void method named showMessage() that displays a welcome message.
    Create a non-void method named calculateAverage() that takes three integer marks as parameters and returns their average.
    Store the marks of three subjects in an integer array in the main method.
    Create a void method named displayMarks() that traverses the array and prints all the marks.*/

import java.util.Scanner;

public class StudentMarkSystem {
    // welcome msg
    public static void showMessage() {
        System.out.println("Welcome to the System\n");
    }

    // calculate average
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // display marks
    public static void displayMarks(int[] marks) {
        System.out.println("All Marks: ");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showMessage();
        int[] marks = { 95, 86, 89 };
        double avg = calculateAverage(marks[0], marks[1], marks[2]);

        System.out.println("Choose Your Option ");
        System.out.println("1. View Marks");
        System.out.println("2. View Average");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayMarks(marks);
                break;
            case 2:
                System.out.println("Average Marks: " + avg);
                if (avg >= 80) {
                    System.out.println("Garde A");
                } else if (avg >= 60) {
                    System.out.println("Grade B");
                } else {
                    System.out.println("Garde C");
                }
                break;
            case 3:
                System.out.println("Successfully exit!!");
                break;
            default:
                System.out.println("Invalid chocie");
        }

    }
}
