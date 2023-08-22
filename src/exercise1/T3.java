package exercise1;

public class T3 {
    public static void main(String[] args) {
  /*   Create a 2D array of integer type where you will store odd and even numbers.
   Develop a program which will identify/print the even numbers.
   */

        int[][] numbers = {{1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        for (int[] r : numbers) {
            for (int c : r) {
                if (c % 2 != 0) {
                    System.out.print(c + " ");
                }
            }

        }
    }
}
