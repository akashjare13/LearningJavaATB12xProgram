package Tasks;

import java.util.Scanner;

public class Task_31stMay_ReverseString_Usinginbuilt {
    //Write a program to reverse a string by using an inbuilt function. -> StringBuffer - reverse()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = scanner.nextLine();

        StringBuilder stringbuilder = new StringBuilder(original);
        String reversed = stringbuilder.reverse().toString();

        System.out.println("original String is:" + original);
        System.out.println("reversed String is: "+ reversed);
        System.out.println("**********************");


        StringBuffer stringbuffer = new StringBuffer(original);
        String Reversed = stringbuffer.reverse().toString();

        System.out.println("original String is:" + original);
        System.out.println("reversed String is: "+ Reversed);
    }
}
