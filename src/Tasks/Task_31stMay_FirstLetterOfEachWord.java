package Tasks;

import java.util.Scanner;

public class Task_31stMay_FirstLetterOfEachWord {
    //First Letter of Each Word in a String

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();

        String[] words = input.split(" " );
        StringBuilder initial = new StringBuilder();

        for(String word : words){
            if(!word.isEmpty()){
                initial.append(word.charAt(0));
            }
        }
        System.out.println(initial.toString());
    }
}
