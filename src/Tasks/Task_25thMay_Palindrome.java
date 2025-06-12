package Tasks;

import java.util.Scanner;

public class Task_25thMay_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
       String input = scanner.nextLine();

       String Reversed = "";

       for(int i=input.length()-1;i>=0;i--){
           Reversed = Reversed + input.charAt(i);
       }

       if(input.equalsIgnoreCase(Reversed)){
           System.out.println("Its Palindrome");
       }
       else {
           System.out.println("Its not a palindrome");
       }




    }
}
