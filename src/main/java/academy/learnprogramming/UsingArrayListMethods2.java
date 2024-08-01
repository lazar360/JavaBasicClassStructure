package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods2 {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        if (pets.isEmpty()) {
            System.out.println("no pets");
        }

        if (pets.size() == 0) {
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        pets.add("dog");
        System.out.println(pets.contains("cat"));
        System.out.println(pets.contains("dog"));

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        System.out.println(pets.equals(newPets)); // true (method equals compares the lists elements)
        newPets.add("cat");
        System.out.println(pets.equals(newPets)); // true (method equals compares the lists elements)
        pets.add(0, "cat");
        System.out.println(pets);
        System.out.println(newPets);
        System.out.println(pets.equals(newPets)); // order of elements is not equal -> false


    }
}
