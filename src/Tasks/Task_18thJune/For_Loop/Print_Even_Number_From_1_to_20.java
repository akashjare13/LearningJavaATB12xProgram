package Tasks.Task_18thJune.For_Loop;

//Print even numbers from 1 to 20
public class Print_Even_Number_From_1_to_20 {
    public static void main(String[] args) {
        int number = 20;

        for (int i = 1; i <= number; i++) {

            if(i%2==0){
                System.out.println("The Number is Even: "+ i);
            }
        }
    }
}
