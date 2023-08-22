package exercise1;

public class T7 {


    public static void main(String[] args) {
        /*     Write a Java program to print the first ten numbers of Fibonacci series.
         */

        int firstNum = 0;
        int secondNum = 1;
        int n = 10;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + "  ");


            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;


        }
    }
}







