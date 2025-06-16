package Tasks;

public class Task_1stJune_Smallest_Number_In_Array {
    //Print the Smallest Element in an Array
    public static void main(String[] args) {


        int[] num = {10, 2, 4, 5, 10,200};

        int min = num[0];

        for (int i = 0;i<num.length;i++) {

            if(num[i]<min){
                min = num[i];
            }

        }
        System.out.println("Smallet element in array: "+ min);
    }
}
