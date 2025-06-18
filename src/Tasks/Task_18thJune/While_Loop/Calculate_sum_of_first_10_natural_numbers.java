package Tasks.Task_18thJune.While_Loop;

//Calculate sum of first 10 natural numbers
public class Calculate_sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first 10 natural numbers:"+sum);
    }
}
