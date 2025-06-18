package Tasks.Task_18thJune.While_Loop;

//Print even numbers from 1 to 20
public class Print_even_numbers_from_1_to_20 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=20){
            if (i % 2 == 0) {
                System.out.println("The number is Even:" + i);
            }
            i++;
            }
        }
    }

