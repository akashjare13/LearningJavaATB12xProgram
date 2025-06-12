package Tasks;

import java.util.Scanner;

public class Task_25thMay_Reverse_Number {

    //Reverse the number using for loop. (In - 12345, Out - 54321)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //int reversed = 0;

        // Using for loop to reverse the number
        for (; number != 0; number /= 10) {
           int digit = number % 10;
            //reversed = reversed * 10 + digit;
            System.out.print(digit);
        }


        //System.out.println("Reversed number: " + reversed);

    }
    }