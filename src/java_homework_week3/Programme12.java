package java_homework_week3;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {

    // Declared method is for check input value is number, alphabets or symbols
    public void checkInputNumberAlphabetsOrSymbol(char ch){
        if (Character.isAlphabetic(ch)) {
            System.out.println("Given input " + ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println("Given input " + ch + " is a Digit.");
        } else {
            System.out.println("Given input " + ch + " is a Special Character.");
        }
    }

    //Declared main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single character: ");
        char ch = scanner.next().charAt(0);

        Programme12 checkInput = new Programme12();
        checkInput.checkInputNumberAlphabetsOrSymbol(ch);
    }
}
