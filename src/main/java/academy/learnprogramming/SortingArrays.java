package academy.learnprogramming;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5,10,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        String[] strings = {"5","500","9"};
        Arrays.sort(strings); // sort in alphabetical order, five begins with b and nine with n, so 5,500,9
        System.out.println(Arrays.toString(strings));
        System.out.println();

    }
}
