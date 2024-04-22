package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonArrayProblems {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        // 1 2 3 4 5
        // 0 1 2 3 4

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]);
        }
        System.out.println();
        /*for (int i = 1; i <= numbers.length ; i++) { // throw an ArrayIndexOutOfBoundException
            System.out.println(i + " - " + numbers[i]);
        }*/
        for (int i = 1; i <= numbers.length -1 ; i++) { // throw an ArrayIndexOutOfBoundException
            System.out.println(i + " - " + numbers[i]);
        }

        // int[20] nums; // !!!!!!!!!!!!size only at initialization!!!!!!!!!!!!!!!!
        int[] nums = new int[20]; // size only at initialisation
        // int size = numbers.length(); // !!!!!!!!!!!does not compile, length is not a method!!!!!!!!!!
        int size = numbers.length;

        // numbers.length=10; // does not compile you can set length of array, only on initialization

    }
}
