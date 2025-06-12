package Tasks;

import java.util.Scanner;

public class Task_25thMay_Fibonacci_Series {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input = scanner.nextInt();
        int first_number = 0;
        int second_number = 1;

        for (int i =0; i<=input;i++){
            System.out.println(first_number + " ");

            int next = first_number + second_number;
            first_number = second_number;
            second_number = next;


        }
    }
}
