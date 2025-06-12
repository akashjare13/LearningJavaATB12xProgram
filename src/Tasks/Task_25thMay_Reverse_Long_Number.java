package Tasks;

import java.util.Scanner;

public class Task_25thMay_Reverse_Long_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        for (; number != 0; number /= 10) {
            long digit = number % 10;
            System.out.print(digit);
        }


    }
}

