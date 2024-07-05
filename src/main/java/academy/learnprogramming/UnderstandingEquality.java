package academy.learnprogramming;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java"); // assign the same reference - same as Stringbuilder three = one

        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Java";
        String y = "Java";

        System.out.println(x == y); // true : put in String pool

        String a = "Java";
        String b = " Java".trim(); // return a new String

        System.out.println(a == b); // false

        String c = "Java";
        String d = " Ja".trim()+"va"; // return a new instance of String

        System.out.println(c == d);
    }
}
