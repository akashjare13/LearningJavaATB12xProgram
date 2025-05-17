package Tasks;

public class Task2_Adult_Senior_Minor {
    public static void main(String[] args) {
        int age = 66;

        String category = (age > 18)
                ? (age > 65 ? "Senior" : "Adult")
                : "Minor";

        System.out.println("You are a " + category);
    }
}
