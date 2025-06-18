package Tasks.Task_18thJune.For_Loop;

//Print the multiplication table of 5
public class Print_the_multiplication_table_of_5 {
    public static void main(String[] args) {
        int num = 5;
        int multi;

        for(int i=1;i<=10;i++){

           multi = num * i;
            System.out.println(num + "*" + i + "= " + multi );

        }

    }

}
