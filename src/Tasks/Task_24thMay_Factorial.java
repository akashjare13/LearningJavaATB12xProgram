package Tasks;

import java.util.Scanner;

public class Task_24thMay_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if( n == 0){
            fact = 1;
        }

        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }

        System.out.println(fact);



    }
}
