package academy.learnprogramming;

public class CompoundAssigmentOperators {
    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        x = x * z; // simple assigment
        x *= z; // shorter form of x = x * z;
        // 3*2 = 6 * 3 = 18
        System.out.println("x = " + x);

        // int a += 5; // does not compile because a doesn't have any value before

        // without explicit casting
        long a = 10;
        int b = 4;
        // b = b * a; // does not compile because b is promoted into long and int was expected

        b*= a; // short for b = (int)(b*a);
        System.out.println("b = "+b);

        long c = 4;
        long d = (c = 2);
        // c = 2 et d = 2 (réassignation de c à 2 avec c = 2)
        System.out.println("c = "+c + " d= " + d);

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f=3) - (h -=2);
        // 3 + 3 * 3 + 1
        // 3 + 9 + 1
        // i = 13
        // f = 3
        // h = -1
        System.out.println("f = "+f + " h= " + h + " i = " + i);


    }
}
