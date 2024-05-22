package academy.learnprogramming;

import java.util.Objects;

public class MethodChaining {

    public static void main(String[] args) {
        String start = "   Java  ";
        String trimmed = start.trim();
        System.out.println("trimmed = " + trimmed);

        String toLowerCase = trimmed.toLowerCase();
        System.out.println("lowercase = " + toLowerCase);

        String result = toLowerCase.replace('j', 'J');
        System.out.println("result = " + result);

        String anotherResult = "   Java  ".trim().toLowerCase().replace('j', 'J');
        System.out.println("anotherResult = " + anotherResult);
        System.out.println("anotherResult == result " + Objects.equals(result, anotherResult));

        //-----------
        String a = "abc";
        String b = a.toUpperCase(); // produces a new String, does not change a variable
        String c = b.replace('B', 'b').replace('C', 'c');// produces new String
        // a= abc
        // b= ABC
        // c= Abc
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);

        if(a.equalsIgnoreCase(b)){
            System.out.println("Strings are equal");
        }

        if(a.toLowerCase().trim().equals(b.toLowerCase().trim())){
            System.out.println("Equal");
        }
        // Strings are equal
        // Equal
        //-----------


    }
}
