package exercise1;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        /*     Write a java program to check whether a given number is prime or not?
         */
        Scanner input =new Scanner(System.in);
        int number  = input.nextInt();


        int counter = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                counter +=  1;
            }
        }
        if (counter == 2) {
            System.out.println( number + " is a prime number");
        } else {
            System.out.println( number  + " is not a prime number");
        }

    }


}

