package exercise1;

public class T5 {
    public static void main(String[] args) {
 /*        Write a program to swap two numbers without a third variable.
   */
        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);


    }


}
