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
        System.out.println("Enter a length of array: ");
        int arrLength = scanner.nextInt();

        // String array Declaration
        String[] strArray = new String[arrLength];
        for (int j = 0; j < strArray.length; j++){
            System.out.println("Please enter " + j + " element value:");
            strArray[j] = scanner.nextLine();
        }

        // Numeric array Declaration
        int[] numArray = new int[arrLength];
        for (int i = 0; i < numArray.length; i++){
            System.out.println("Please enter " + i + " element number value:");
            numArray[i] = scanner.nextInt();
        }

        //int[] numArray = scanner.next();
        // Numeric Array declaration
        //int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};

        //String array declaration
        //String[] strArray = { "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};

        //Closing the scanner object
        scanner.close();

        sortingArray(numArray, strArray);
    }

    // Declared method for the sorting number and string array
    public static void sortingArray(int[] numArray, String[] strArray){
        System.out.println("Actual Numeric Array was :  " + Arrays.toString(numArray));
        //Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is : " + Arrays.toString(numArray));
        //System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));

    }


}
