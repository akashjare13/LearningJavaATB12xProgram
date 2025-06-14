package Tasks;

import java.util.Scanner;

public class Task_31stMay_ReverseString {
    //Write a program to reverse a string without using inbuilt functions. -> forloop

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String orginal_Word = scanner.nextLine();
        String reversed_Word = "";

        for(int i=orginal_Word.length()-1;i>=0;i--){
            reversed_Word = reversed_Word+orginal_Word.charAt(i);
        }
        System.out.println("Original Word is: "+ orginal_Word);
        System.out.println("Reversed Word is: "+ reversed_Word);
    }
}
