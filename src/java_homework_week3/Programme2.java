package java_homework_week3;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Number to checked year has been leap year or not? ");
        int sc = scanner.nextInt();
        isLeapYear(sc);
        scanner.close();
    }

    public static void isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is leap year ");
        } else
            System.out.println("The year " + year + " is not a leap year ");
    }
}
