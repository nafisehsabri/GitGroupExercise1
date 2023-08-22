package exercise1;

public class T10 {

    public static void main(String[] args) {
        /*     Write a Java program to print out duplicate elements from an Array of Strings
         */
        String[] myFavoriteFruits = {"apple", "pear", "banana", "fig", "cherry", "grape", "pear"};

        for (int i = 0; i < myFavoriteFruits.length-1; i++) {
            for (int j = i+1; j < myFavoriteFruits.length; j++) {

                if(myFavoriteFruits[i].equals(myFavoriteFruits[j])) {
                    System.out.println("Warning: " + myFavoriteFruits[j] + " is duplicated!");
                }
            }
        }

    }

}
