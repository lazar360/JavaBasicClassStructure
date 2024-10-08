package academy.learnprogramming;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] one = new int[3]; // empty array with 3 spaces
        int[] two = new int[]{10, 11, 12};

        double[] b = new double[4*5/2]; // empty array with 10 spaces

        int x = 4;
        int y = 4;

        double[] c = new double[x*y];

        int[] three = {10, 11, 12}; // anonymous array
        int[] four = {};

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; // creates two arrays
        int ids2[], types2; // creates array and int, bad practice

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); // true
        System.out.println(animals == myAnimals); // true
        System.out.println(Arrays.equals(animals, myAnimals)); // true

        System.out.println(animals.equals(otherAnimals)); // false
        System.out.println(animals == otherAnimals); // false
        System.out.println(Arrays.equals(animals, otherAnimals)); // true

        System.out.println(animals);
        System.out.println(animals.toString());

        System.out.println(Arrays.toString(animals));



    }
}
