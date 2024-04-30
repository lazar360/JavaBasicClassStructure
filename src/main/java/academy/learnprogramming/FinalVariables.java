package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalVariables {

    private static final int SIZE = 10;
    // private static int SIZE = 10; // throws an out of bound exception in the for loop
    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[SIZE];

        // SIZE = 11;
        // SIZE++;
        int doubleSize = 2 * SIZE;

        for (int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("changed"); // we can add an element to a final list
        // VALUES = new ArrayList<>(); // we can not reassign a reference to the list
        final int myNumber = 10;
        // myNumber = 11; does not compile

    }
}
