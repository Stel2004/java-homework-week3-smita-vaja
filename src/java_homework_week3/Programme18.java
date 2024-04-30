package java_homework_week3;

import java.util.Arrays;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {

    public static void main(String[] args) {
        // Numeric array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        // Calculating the sum of arrays value using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Values of the element of the array are : " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the arrays are : " + sum);
    }
}
