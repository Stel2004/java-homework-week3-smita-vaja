package java_homework_week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {

    public static void main(String[] args) {
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

        // Numeric array declaration
        //int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};

        // called method for finding average of array
        averageOfArray(numArray);
    }

    public static void averageOfArray(int[] numArray){
        int sum = 0;
        // Calculating the sum of arrays value
        for (int i = 0; i < numArray.length; i++) {
            sum = (sum + numArray[i]);
        }
        // Finding the average of arrays value
        int average = (sum / numArray.length);
        System.out.println("Entered values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average value of given array elements are : " + average);
    }
}
