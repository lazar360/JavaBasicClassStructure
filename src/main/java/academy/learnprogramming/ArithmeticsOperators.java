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

        a = 4;
        b = 3 - 2 * a --; // use a then decrement
        // 3 - 8
        // - 5
        // a = 3 b = - 5
        System.out.println("a = " + a + " b = " + b);

        long c = 2;
        long d = 4 + 3 * c++; // use then increment
        // d = 4 + 6
        // c = 3
        System.out.println("c = " + c + " d = " + d);

        result = 10 - 3 * (2+1) - 4 / (1+3);
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1
        // 0
        System.out.println("result = " + result);

        int i = 10;
        int j = 3;
        int k = i % j; // 1
        int e = 10 % 2; // 0
        System.out.println("k = " + k + " e = " + e);


    }
}
