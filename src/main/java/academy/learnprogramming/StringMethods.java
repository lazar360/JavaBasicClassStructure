package academy.learnprogramming;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";
        // j a v a   i s   f u n
        // 0 1 2 3 4 5 6 7 8 9 10
        // length
        System.out.println("str.length() " + str.length());

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));

        // index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun", 10));

        // substring
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(4,4)); // empty string
        // System.out.println(str.substring(4,2)); // throws out of bound exception
        // System.out.println(str.substring(4,14)); // throws out of bound exception (only 10 characters)

        String dog = "Lucky";
        dog.toUpperCase();
        System.out.println(dog); // "Lucky"




    }
}
