package Tasks.Task_18thJune.While_Loop;

//Print the multiplication table of 7
public class Print_the_multiplication_table_of_7 {
    public static void main(String[] args) {
        int i = 1;
        int num = 7;
        int multi = 0;
        while (i<=10){
            multi =  num * i;
            System.out.println(num +" * "+  i + "=" + multi);
            i++;
        }

    }
}
