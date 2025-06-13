package Tasks;

import java.util.Scanner;

//Write a program that prints numbers from 1 to 100.
// However, for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz." For numbers that are multiples of
// both 3 and 5, print "FizzBuzz."

public class Task_25thMay_FizzBuzz {
    public static void main(String[] args) {
            // Loop from 1 to 100
            for (int i = 1; i <= 100; i++) {
                // Check if divisible by both 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }
            }
        }
    }

