package academy.learnprogramming;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public void jump1(int... numbers) {
    }

    public void jump2(int start, int... numbers) {
    }

    // public void jump3(int... numbers, int start){} // does not compile, var args must be the last
    // public void jump3(int... start, int... numbers){}
    public void jump3(int[] start, int[] end) {
    }

    public static void main(String[] args) {
        jump(1);
        jump(1, 3);
        jump(1, 5, 6, 7);
        jump(1, new int[]{1, 2, 3});
        // jump(1,null); // null pointer exception
        run(); // ne passe pas dans le foreach
        run(11,22,33,44,55,66,77, 88,99);

    }

    public static void jump(int start, int... numbers) {
        System.out.println("start= " + start + " numbers.length= " + numbers.length);
    }

    public static void run(int... numbers) {
        for (int number : numbers) {
            System.out.println("in for loop");
            System.out.println("number= " + number);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
