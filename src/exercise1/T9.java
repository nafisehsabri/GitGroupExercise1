package exercise1;

public class T9 {

    public static void main(String[] args) {

        /*     Write a Java program to print the second-largest number in the array.
         */
        int tempVar;
        int array[] = {20, 40, 50, 10, 30};

        for(int i = 0; i<array.length; i++ ){  // previous number
            for(int j = i+1; j<array.length; j++){  // next number

                if(array[i]>array[j]){
                    // to swap the two numbers
                    tempVar = array[i];
                    array[i] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        System.out.println(array[array.length-2]);
        // System.out.println(array[array.length-1] gives us the largest number


    }
}
