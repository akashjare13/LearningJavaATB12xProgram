package Tasks;

import java.util.Scanner;

public class Task_25thMay_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int input = scanner.nextInt();
        boolean isleap = false;
        if(input% 4 == 0){
            if(input% 100 != 0){
                isleap = true;
            }
            else if(input % 400 ==0) {
                isleap = true;
            }
        }
        if (isleap){
            System.out.println(input + " is a Leap Year");
        }
        else{
            System.out.println(input + " it's not a Leap year");
        }
    }
}
