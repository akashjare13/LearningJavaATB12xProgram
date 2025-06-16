package Tasks;

public class Task_1stJune_Odd_Even_From_Array {
    //Odd and Even Numbers from an Array
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,8,9,9,100,200,233};
        for(int num : number){

            if(num %2 == 0){
                System.out.println("The number is Even "+ num);
            }
            else if(num %2 !=0){
                System.out.println("The number is Odd "+ num);
            }

        }
    }
}
