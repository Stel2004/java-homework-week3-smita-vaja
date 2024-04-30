package java_homework_week3;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class Programme20 {

    public static void main(String[] args) {
        // Scanner class
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

        System.out.println("Enter the elements value to find in array's elements: ");
        int findElementValue = scanner.nextInt();

        //int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        System.out.println(isArrayContains(numArray, findElementValue));
        //System.out.println(isArrayContains(numArray, 1789));
    }

    // Declared method to check array contains specific values
    public static boolean isArrayContains(int[] arrVal, int value){
        boolean isValContains = false;
        for (int i = 0; i < arrVal.length; i++) {
            if (arrVal[i] == value) {
                isValContains = true;
                break;
            }
        }
        return isValContains;
    }
}
