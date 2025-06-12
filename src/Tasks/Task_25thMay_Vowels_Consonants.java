package Tasks;

import java.util.Scanner;

public class Task_25thMay_Vowels_Consonants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);

            if(Character.isLetter(ch)){

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels is "+ vowels);
        System.out.println("Consonants is "+ consonants);


    }
}
