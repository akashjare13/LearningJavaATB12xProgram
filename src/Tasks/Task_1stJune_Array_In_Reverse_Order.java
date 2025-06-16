package Tasks;

import java.util.Scanner;

public class Task_1stJune_Array_In_Reverse_Order {
    //Elements of an Array in Reverse Order.
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};

        for(int i=input.length-1;i>=0;i--){

            System.out.print(input[i]);
        }

    }
}
