package exercise1;

public class T4 {
    public static void main(String[] args) {
 /*    Create a 2D array of integers.
   Develop a program which calculate the sum of even and odd numbers for that array.
   */
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int[] r : array) {
            for (int c : r) {
                if (c % 2 == 0) {
                    evenSum = c + evenSum;

                } else if (c % 2 != 0) {
                    oddSum = c + oddSum;
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}

