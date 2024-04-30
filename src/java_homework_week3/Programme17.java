package java_homework_week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length for both arrays: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        // String array Declaration
        String[] strArray = new String[arrLength];
        System.out.println("-----String Array elements-------------");
        for (int j = 0; j < strArray.length; j++){
            System.out.println("Please enter " + j + " element value of String Array:");
            strArray[j] = scanner.nextLine();
        }

        // Numeric array Declaration
        int[] numArray = new int[arrLength];
        System.out.println("-----Number Array elements-------------");
        for (int i = 0; i < numArray.length; i++){
            System.out.println("Please enter " + i + " element value of Number Array:");
            numArray[i] = scanner.nextInt();
        }

        //Closing the scanner object
        scanner.close();

        // calling static method to sort both arrays
        sortingArray(numArray, strArray);
    }

    // Declared method for the sorting number and string array
    public static void sortingArray(int[] numArray, String[] strArray){
        System.out.println("Actual Numeric Array:  " + Arrays.toString(numArray));
        //Sorting the numeric array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array: " + Arrays.toString(numArray));
        //System.out.println("");
        System.out.println("Actual String Array: " + Arrays.toString(strArray));
        //Sorting the string array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));

    }


}
