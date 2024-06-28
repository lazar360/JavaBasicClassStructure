package academy.learnprogramming;

import java.util.Random;

public class StringEquality {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");

        System.out.println("name == anotherName -> " + (name == anotherName)); // in cache, same memory address, true
        System.out.println("name == john -> " + (name == john)); // true
        System.out.println("name == newName -> " + (name == newName)); // false
        System.out.println();
        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));
        System.out.println();
        System.out.println("name -identityHashCode -> " + System.identityHashCode(name));
        System.out.println("name -identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("name -identityHashCode -> " + System.identityHashCode(john));
        System.out.println("name -identityHashCode -> " + System.identityHashCode(newName));

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        String str4 = "ab" + "c";

        System.out.println();
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4);// true


    }
}
