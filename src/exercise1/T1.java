package exercise1;

public class T1 {
    /* Create a program that uses an array to store a list of temperatures for a week.
    Then the program uses a loop to find the highest and lowest temperature for the week
    */

    public static void main(String[] args) {
        int[] temp = {75, 80, 67, 78, 66, 48, 50};


        int highest = temp[0];
        int lowest = temp[0];

        for (int t : temp) {
            if (t > highest) {
                highest = t;

            } else if (t < lowest) {
                lowest = t;
            }
        }
        System.out.println(highest);
        System.out.println(lowest);
    }
}


