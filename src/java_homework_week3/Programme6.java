package java_homework_week3;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    public static void main(String[] args) {
        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check :   ");
        int number = scanner.nextInt();
        Programme6 oddEven = new Programme6();
        String ans = oddEven.checkOddOrEvenNumber(number);
        System.out.println("Entered number " + number + " is " + ans + " number.");

        // Closing the scanner object
        scanner.close();
    }

    // Checking the odd or even
    public String checkOddOrEvenNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
