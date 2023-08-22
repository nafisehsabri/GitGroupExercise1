package exercise1;

public class T2 {
    /* Create an array of integer values.
   After the array is created, calculate the sum of all stored elements in that array.
   */
    public static void main(String[] args) {
        int[] numbers = {11, 12, 13, 14};

        int sum = 0;

        for (int n : numbers) {
            sum = n + sum;

        }
        System.out.println(sum);

    }
}
