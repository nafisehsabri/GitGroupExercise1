package exercise1;

public class swapVar {
    public static void main(String[] args) {

        /*     to swap the value of string a and string b
         */

        String a="apple";
        String b="cherry";

        String temp;


        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);



    }
}
