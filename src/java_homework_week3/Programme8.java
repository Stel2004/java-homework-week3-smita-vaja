package java_homework_week3;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry.
 */
public class Programme8 {

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

        if(charValue == 'A' || charValue == 'a'){
            System.out.println("The city is Amsterdam");
        } else if(charValue == 'B' || charValue == 'b') {
            System.out.println("The city is Brighton");
        } else if (charValue == 'C' || charValue == 'c') {
            System.out.println("The city is Cardiff");
        } else if (charValue == 'D' || charValue == 'd') {
            System.out.println("The city is Dan hill");
        } else if (charValue == 'E' || charValue == 'e') {
            System.out.println("The city is Elam hurst");
        } else if (charValue == 'F' || charValue == 'f') {
            System.out.println("The city is France");
        } else {
            System.out.println("Any other city name does not exists ");
        }

    }
}
