package academy.learnprogramming;

public class ArithmeticsOperators {

    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3; // 8
        System.out.println("result = " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10; // 5
        System.out.println("result = " + result);

        int a = 4;
        int b = 3 - 2 * --a; // decrement then use
        // 3 - 6
        // b = - 3 a = 3

        System.out.println("a = " + a + " b = " + b);
    }

}
