package academy.learnprogramming;

public class MethodArguments {

    int getZEro() {
        return 0;
    }// 0 arguments niladic

    int increment(int i) {
        return i + 1;
    }// 1 arguments monadic

    int sum(int i, int j) {
        return i + j;
    }// 2 arguments dyadic

    int plusMinus(int i, int j, int k) {
        return i + j - k;
    }// 3 arguments (triadic) -> to avoid

    double average(double a, double b, double c, double d) {
        return a + b + c + d;
    } // 4 arguments or + (polyadic) -> to avoid

    // void test {} // does not compile no brackets

    // void test(int a; int b){} // does not compile no brackets
    // void test(); // does not compile missing method body


}
