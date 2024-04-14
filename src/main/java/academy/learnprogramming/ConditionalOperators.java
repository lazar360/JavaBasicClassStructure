package academy.learnprogramming;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d = " + d + " e = " + e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f++ < 4) is never executed (short-circuiting)
        boolean h = (f-- == 4) && !g; // true && !g, f =3,
        // g = false
        // f = 3
        // h = true
        System.out.println("g = " + g + " h = " + h + " f = " + f);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        // true && true (anotherInt 4 -> 3) || false(myInt 3 -> 4)
        // true || false
        // myBoolean = true
        // anotherInt = 3
        // myInt = 3
        System.out.println(" myInt = " + myInt + "anotherInt = " + anotherInt + "myBoolean " + myBoolean);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        // true false
        // x = true
        // y = 10
        // z = false
        System.out.println("x " + x + "y " + y + "z " + z);


    }
}
