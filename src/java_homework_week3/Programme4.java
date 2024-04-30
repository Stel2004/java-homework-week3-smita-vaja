package java_homework_week3;

import java.time.Month;
import java.util.Scanner;

/**
 * 4. Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * b. Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 *  year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 *  2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 *  9999
 */
public class Programme4 {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else
            return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) { // 2
            case 2:
                // (expression(condition)) ? "if body" : "else body";
                return isLeapYear(year) ? 29 : 28; // ternary operator
            case 4, 6, 9, 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to verify year is Leap Year or not:");
        int year = scanner.nextInt();

        boolean res = isLeapYear(year);
        if (res == true){
            System.out.println("Entered year " + year + " is leap year.");
        } else {
            System.out.println("Entered year " + year + " is not leap year.");
        }

        System.out.println("Enter the month to get the days of that month:"); //2
        int monthNumber = scanner.nextInt();
        System.out.println("Enter the year to verify the leap year along with month days:"); // 2020
        int years = scanner.nextInt();

        // called the getDaysInMonth() method
        int result = getDaysInMonth(monthNumber, years); //29

        String monthName = Month.of(monthNumber).name();

        if(result == 29 ){
            //February has 29 days in a year and 2020 is a leap year
            System.out.println( monthName + " has " + result + " days and " + years + " is a leap year");
        } else {
            System.out.println( monthName + " has " + result + " days and " + years + " is a not leap year");
        }
    }
}

