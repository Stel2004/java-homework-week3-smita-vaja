package java_homework_week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length for both arrays: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        // Numeric array Declaration
        int[] numArray = new int[arrLength];
        System.out.println("---------Number Array elements-------------");
        for (int i = 0; i < numArray.length; i++){
            System.out.println("Please enter " + i + " element value of Number Array:");
            numArray[i] = scanner.nextInt();
        }

        //int[] numArray = {19, 35, 18, 240, 950, 2255, 897, 145, 77};
        // calling sum of array function to add all elements of array
        sumOfArray(numArray);
    }

    public static void sumOfArray(int[] numArr){
        int sum = 0;
        // Calculating the sum of arrays value using for loop
        for (int i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i];
        }
        System.out.println("Original elements value of numeric array : " + Arrays.toString(numArr));
        System.out.println("Sum of above elements of numeric array : " + sum);
    }
}
