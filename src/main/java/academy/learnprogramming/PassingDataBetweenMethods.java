package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number = " + number);
        newNumber(5);
        System.out.println("number = " + number);
        String name = "Jimmy";
        System.out.println("name= " + name);
        newName(name);
        System.out.println("name= " + name);

        StringBuilder sb = new StringBuilder();
        StringBuilder s = sb;
        s.append("s= " + s);

        // build(sb);
        System.out.println("s= " + s);
        System.out.println("stringBuilder= " + sb);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        listModifier(list);
        System.out.println(list);
    }

    public static void newNumber(int number){ // It is a copy which was passed
        System.out.println("in new number number = " + number);
        number = 10; // copy
        System.out.println("in new number number = " + number);
    }

    public static void newName(String name){ // It is a copy which was passed
        System.out.println("in new name = " + name);
        name = "Timmy"; // copy
        System.out.println("in new name = " + name);
    }

    public static void build(StringBuilder s){ // It is a copy of stringbuilder; these two sb have two references which point the same reference //
        // s = new StringBuilder(); // reassign the element in string builder -> empty string
        s.append("Tom");
    }
    public static void listModifier(List<Integer> list){
        list.set(0, 2);
        System.out.println("in ListModifier, list = " + list);
    }
}
