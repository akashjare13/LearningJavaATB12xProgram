package Tasks;

public class Task2_Max_Number_From_Three_Number {
    public static void main(String[] args) {
        int Number1 = 12;
        int Number2 = 15;
        int Number3 = 0;

        int max = (Number1> Number2) ?
                ((Number1 > Number3) ? Number1 : Number3) :
                ((Number2 > Number3) ? Number2 : Number3);

        System.out.println("The maximum number is: " + max);
    }
}
