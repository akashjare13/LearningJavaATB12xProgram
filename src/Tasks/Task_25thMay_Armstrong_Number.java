package Tasks;

import java.util.Scanner;

public class Task_25thMay_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        int original_number = number;
        int result = 0;
        int num_digit = String.valueOf(number).length();

        while (number != 0){
            int digit = number % 10;
            result += Math.pow(digit, num_digit);
            number /= 10;
        }
        if(result == original_number){
            System.out.println("It is Armstrong Number");
        }
        else {
            System.out.println("It is Not Armstrong Number");
        }

    }
}
