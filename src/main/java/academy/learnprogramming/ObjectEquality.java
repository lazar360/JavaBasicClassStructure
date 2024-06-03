package academy.learnprogramming;

import java.util.Objects;

public class ObjectEquality {
    public static void main(String[] args) {
        // comparing objects
        /*Integer myInteger = 127;
        Integer myOtherInteger = 127;
        System.out.println(myInteger == myOtherInteger); // true car inférieur à 128 (utilisation du cache)

        myInteger = 128;
        myOtherInteger = 128;
        System.out.println(myInteger == myOtherInteger); // false*/

        Integer myInteger = 128;
        Integer myOtherInteger = 128;
        System.out.println(myInteger == myOtherInteger);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;
        System.out.println(int1 == int2);
        System.out.println(int1 == int3);
        System.out.println(int2 == int3);

        int2 = null;
        System.out.println("Objects.equals(int1, int2) : " + Objects.equals(int1, int2)); // false
        System.out.println(int1.equals(int3));
        System.out.println(int2.equals(int3)); // throw a null pointer exception

    }
}
