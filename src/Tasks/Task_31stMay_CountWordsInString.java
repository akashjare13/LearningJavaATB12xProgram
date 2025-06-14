package Tasks;

import java.util.Scanner;

public class Task_31stMay_CountWordsInString {
    //Count the Number of Words in a String (replaceAll)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        String count_word = input.replaceAll("[^a-zA-Z0-9 ]", "");
        count_word = count_word.replaceAll("\\s+", " ").trim();


        String[] words = count_word.split(" ");
        int wordCount = (count_word.isEmpty()) ? 0 : words.length;

        System.out.println("Word count: " + wordCount);
    }
}
