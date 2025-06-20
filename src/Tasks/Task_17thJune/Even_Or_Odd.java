package Tasks.Task_17thJune;

import java.util.Scanner;

//Check if a Number is Even or Odd.
public class Even_Or_Odd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("the number is even: "+ number);

        }
        else {
            System.out.println("the number is odd: "+ number);
        }

    }
}
