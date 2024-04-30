package java_homework_week3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Symbol from your choice (+, -, /, *): ");
        char choice = obj.next().charAt(0);

        System.out.println("Enter First Number: ");
        double number1 = obj.nextDouble();
        System.out.println("Enter Second Number: ");
        double number2 = obj.nextDouble();
        obj.close();
        selectChoice(choice, number1, number2);
        obj.close();
    }

    public static void selectChoice(char choiceVal, double num1, double num2){
        String manipulations = " ";
        double res = 0.00;
        if(choiceVal == '+'){ // addition
            res = addition(num1, num2);
            manipulations = "addition";
        } else if (choiceVal == '-') { // subtraction
            res = subtraction(num1, num2);
            manipulations = "subtraction";
        } else if (choiceVal == '/') {// division
            res = division(num1, num2);
            manipulations = "division";
        } else if (choiceVal == '*') { // multiplication
            res = multiplication(num1, num2);
            manipulations = "multiplication";
        }
        System.out.println("The " + manipulations + " of " + num1 + " and " + num2 + " is " + res);
    }

    public static double addition(double num1, double num2){
        double addAns = (num1 + num2);
        return addAns;
    }

    public static double subtraction(double num1, double num2){
        double subAns = (num1 - num2);
        return subAns;
    }

    public static double multiplication(double num1, double num2){
        double mulAns = (num1 * num2);
        return mulAns;
    }

    public static double division(double num1, double num2){
        double divisionAns = (num1 / num2);
        return divisionAns;
    }


}
