package java_homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _________________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */
public class Programme3 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input student details
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            // Input marks for three subjects
            System.out.println("Enter marks for Math, Science, and English (out of 100):");
            System.out.print("Enter maths marks out of 100: ");
            int math = scanner.nextInt();
            System.out.print("Enter science marks out of 100: ");
            int science = scanner.nextInt();
            System.out.print("Enter english marks out of 100: ");
            int english = scanner.nextInt();


                getStudentResult(name, rollNo, math, science, english);

            scanner.close();
        }

        public static void getStudentResult(String name, int rollNo, int math, int science, int english){

            if((math < 0 ) || (science < 0 ) || (english < 0 )){
                System.out.println("Entered marks is not valid");
                return;
            } else if(math > 100 || science > 100 || english > 100) {
                System.out.println("Entered marks are not valid");
                return;
            }

            // Calculate total, percentage, and result
            int total = (math + science + english);
            double percentage = ((total * 100) / 300);

            String result;
            String grade;
            if((math < 35 ) || (science < 35 ) || (english < 35 )){
                result = "Fail";
                grade = "Fail";
            } else {
                result = ((percentage >= 35)) ? "Pass" : "Fail";
                // Determine grade
                if (percentage >= 80  && percentage <= 100) {
                    grade = "A+";
                } else if (percentage >= 60 && percentage < 80) {
                    grade = "A";
                } else if (percentage >= 50 && percentage < 60) {
                    grade = "B";
                } else if (percentage >= 35 && percentage < 50) {
                    grade = "C";
                } else {
                    grade = "Fail";
                }
            }

            // Print mark sheet
            System.out.println("-----------------------------");
            System.out.println("|                           |");
            System.out.println("| Mark Sheet                |");
            System.out.println("|___________________________|");
            System.out.println("| Name:" + name + "                 |");
            System.out.println("| Roll No:"    + rollNo + "                 |");
            System.out.println("|___________________________|");
            System.out.println("| Subjects: Marks           |");
            System.out.println("|___________________________|");
            System.out.println("| Maths:" + math + "                   |");
            System.out.println("| Science:" + science + "               |");
            System.out.println("| English:" + english + "               |");
            System.out.println("|___________________________|");
            System.out.println("| Total:"             + total + "                  |");
            System.out.println("|___________________________|");
            System.out.println("| Percentage:" + percentage + "           |");
            System.out.println("| Result:" + result + "               |");
            System.out.println("| Grade:"      + grade + "                |");
            System.out.println("|___________________________|");

        }
    }
