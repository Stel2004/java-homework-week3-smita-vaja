package java_homework_week3;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {

    // Declared Main method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        checkNumberPositiveNegativeZero(number);
        //Closing the scanner object
        scanner.close();
    }

    // Declared static method to check number is positive, negative or zero.
    public static void checkNumberPositiveNegativeZero(int n1){
        if (n1 > 0) {
            System.out.println("Entered number " + n1 + " is a POSITIVE number");
        } else if (n1 < 0) {
            System.out.println("Entered number " + n1 + " is a NEGATIVE number");
        } else {
            System.out.println("Entered number " + n1 + " is ZERO");
        }
    }
}
