package java_homework_week3;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement
 */
public class Programme9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabets from 'A' to 'F':");
        char alphabets = scanner.next().charAt(0);

        // Creating object of class
        Programme8 cityWise = new Programme8();
        // Called instance method
        cityWise.getCityName(alphabets);
    }

    public void getCityName(char charValue){

        switch (charValue) {
            case 'A':
                System.out.println("The city is Amsterdam");
                break;
            case 'B':
                System.out.println("The city is Brighton");
                break;
            case 'C':
                System.out.println("The city is Cardiff");
                break;
            case 'D':
                System.out.println("The city is Dan hill");
                break;
            case 'E':
                System.out.println("The city is Elm Hurst");
                break;
            case 'F':
                System.out.println("The city is France");
                break;
            default:
                System.out.println("Any other city name does not exists ");
        }
    }
}
