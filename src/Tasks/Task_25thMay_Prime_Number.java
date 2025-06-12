package Tasks;

import java.util.Scanner;

public class Task_25thMay_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=input;i++) {
            if(input%i==0) {

                count++;
            }

        }
        if(count==2) {
            System.out.println("Prime number");

        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
