package Tasks;

public class Task_1stJune_Sum_Of_Array {
    //Sum of All Items of the Array
    public static void main(String[] args) {
        int[] number = {100,20,30,40,50,60};

        int sum = 0;

        for(int Sum: number){
            sum = sum+Sum;
        }
        System.out.println("Addition of Array is: "+ sum);
    }
}
