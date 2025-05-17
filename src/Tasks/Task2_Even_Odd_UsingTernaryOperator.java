package Tasks;

public class Task2_Even_Odd_UsingTernaryOperator {
    public static void main(String[] args) {
        int number = 8;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result + ".");
    }
}
