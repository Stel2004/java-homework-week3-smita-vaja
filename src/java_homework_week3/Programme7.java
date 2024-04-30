package java_homework_week3;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {

    // Declared method for calculating the sales commission
    public int calculateSalesCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

    // Declared main method
    public static void main(String[] args) {
        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller Name :  ");
        String name = scanner.nextLine();
        System.out.println("Enter seller ID : ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount :  ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary :  ");
        int basicSalary = scanner.nextInt();

        // Called instance method via object of class
        Programme7 salesCommission = new Programme7();
        int grossSalary = (basicSalary + salesCommission.calculateSalesCommission(salesAmount));
        int commissionAmount = salesCommission.calculateSalesCommission(salesAmount);
        System.out.println("Seller name                : " + name);
        System.out.println("Seller id                  : " + sellerId);
        System.out.println("Seller's sales amount      : " + salesAmount);
        System.out.println("Seller's basic salary      : " + basicSalary);
        System.out.println("Seller's commission amount : " + commissionAmount);
        System.out.println("Seller's gross salary      : " + grossSalary);


        // closing the scanner object
        scanner.close();
    }
}
