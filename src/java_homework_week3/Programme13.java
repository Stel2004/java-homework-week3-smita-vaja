package java_homework_week3;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {

    // Print the days name based on user selected number between 1 to 7
    public static void printDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("It's MONDAY");
                break;
            case 2:
                System.out.println("It's TUESDAY");
                break;
            case 3:
                System.out.println("It's WEDNESDAY");
                break;
            case 4:
                System.out.println("It's THURSDAY");
                break;
            case 5:
                System.out.println("It's FRIDAY");
                break;
            case 6:
                System.out.println("It's SATURDAY");
                break;
            case 7:
                System.out.println("It's SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days only.");
        }
    }

    // Declared main method
    public static void main(String[] args) {
        // scanner declaration for getting input form user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1 to 7 for week days:   ");
        int dayVal = sc.nextInt();
        printDaysName(dayVal);
        // closing the scanner object
        sc.close();
    }
}
