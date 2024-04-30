package java_homework_week3;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check the number is odd or even: ");
        int number1 = scanner.nextInt();
        oddEvenNumber(number1);

    }

    public static void oddEvenNumber(int num) {
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println("Entered number " + num + " is " + evenOdd + " number.");
    }
}
