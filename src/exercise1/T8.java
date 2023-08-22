package exercise1;

public class T8 {
    public static void main(String[] args) {
        /*     maximum and minimum number in the array?
         */

        int[] footballScores = {8, 7, 2, 9, 12, 3};
        int maximum = footballScores[0];
        int minimum = footballScores[0];

        for (int s : footballScores) {
            if (s > maximum) {
                maximum = s;
            } else if (s < minimum) {
                minimum = s;
            }

        }
        System.out.println(maximum);
        System.out.println(minimum);
    }

}
