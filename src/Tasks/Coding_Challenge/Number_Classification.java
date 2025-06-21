package Tasks.Coding_Challenge;
//Easy
//Number Classification
//Write a program to check if a number is positive, negative, or zero.
//**Requirements:**
//- Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
public class Number_Classification {
    public static void main(String[] args) {
        int number = 15;

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("The number is zero");
        }

    }
}