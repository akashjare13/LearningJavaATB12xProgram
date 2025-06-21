package Tasks.Coding_Challenge;
//Find Largest of Three Numbers
//Create a program to find the largest among three numbers using if-else statements.
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
public class Find_Largest_Of_Three_Number {
    public static void main(String[] args) {
    int a= 15;
    int b = 27;
    int c = 19;
    // Find the largest number using if-else statements
        if (a >= b && a >= c) {
        System.out.println("Largest number is: " + a);
    } else if (b >= a && b >= c) {
        System.out.println("Largest number is: " + b);
    } else {
        System.out.println("Largest number is: " + c);
    }
}

}

