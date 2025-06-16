package Tasks;

public class Task_1stJune_Largest_Number_In_Array {
    //Print the Largest Element in an Array.
    public static void main(String[] args) {

        int[] number = {10,3,50,69,60,70,1};

        int max = number[0];

        for(int i=0;i<number.length;i++){
            if(max < number[i]){
                max = number[i];
            }
        }
        System.out.println("Largest number is: "+ max);
    }
}
