package java_homework_week3;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme11 {
    public static void main(String[] args) {

        System.out.println("Below numbers are divisible by 3 from between 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            divisibleByThree(i);
        }
        System.out.println("\n");
        System.out.println("Below numbers are divisible by 5 from between 1 to 100: ");
        for (int j = 1; j <= 100; j++) {
            divisibleByFive(j);
        }
    }

    // Declared method for number divisible by three
    public static void divisibleByThree(int number) {
        if (number % 3 == 0) {
            System.out.print(number + ", ");
        }
    }

    // Declared method for number divisible by five
    public static void divisibleByFive(int number) {
        if (number % 5 == 0) {
            System.out.print(number + ", ");
        }
    }
}
