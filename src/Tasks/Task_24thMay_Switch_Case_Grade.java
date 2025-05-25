package Tasks;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Arrays;
import java.util.Scanner;

public class Task_24thMay_Switch_Case_Grade {
    // Kids -> A -> Excellent, F -> Fail
    // Create a program that will basically be based on
    // the alphabet or based on the grade.
    // You will give the message to the kid if you got
    // excellent, very good, good, needs improvement,
    // fail, or invalid grade.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        // Determine comment using switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
    }



