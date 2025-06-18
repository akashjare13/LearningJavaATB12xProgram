package Tasks.Task_18thJune.For_Loop;

//Print the sum of first 10 natural numbers
public class Print_the_sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1;i<=10;i++){
            sum = sum+i;

        }
        System.out.println("The sum of first 10 natural number is: "+ sum);
    }
}
