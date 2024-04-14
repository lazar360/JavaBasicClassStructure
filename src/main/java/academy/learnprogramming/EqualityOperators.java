package academy.learnprogramming;

public class EqualityOperators {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        boolean c = a == b; // false
        boolean d = a != b; // true

        // boolean g = true == 0; // does not compile
        // boolean h = false != "test"; does not compile

        boolean x = true;
        boolean y = false;
        boolean z = (y == true) && (x =false); // short circuiting !!!!
        // x = true
        // y = false
        // z = false
        System.out.println(x +" " + y + " " + z);
    }
}
