package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {
    /*   public static void main(String[] args) {

    }*/

    public static void main(String... args) {
        System.out.println(args.length);
        print(args);
        print("Java", "Java","Java","Java");
        print("Java", "is","very","Nice");
    }

    private static void print(String... myArgs) {
        System.out.println(Arrays.toString(myArgs));
    }
}
