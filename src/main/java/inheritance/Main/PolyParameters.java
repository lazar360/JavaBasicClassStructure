package inheritance.Main;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Husky;

import java.util.Objects;

public class PolyParameters {

    public static void main(String[] args) {

        Husky husky = new Husky(3);
        husky.setName("Rex");
        printDetails(husky);

        Rabbit rabbit = new Rabbit();
        printDetails(rabbit);

        Cat cat = new Cat(8);
        printDetails(cat);

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);
        Animal kitty = createAnimal("Kitty", 3);
        printDetails(kitty);

        Animal bunny = createAnimal("Bunny", 2);
        printDetails(bunny);

    }

    /*public static void printDetails(Husky husky){
        husky.printDetails();
    }

    public static void printDetails(Rabbit rabbit){
        rabbit.printDetails();
    }*/

    public static void printDetails(Animal animal) {
        animal.printDetails();
    }

    public static Animal createAnimal(String name, int age) {
        if (Objects.equals(name, "Rex")) {
            Animal animal = new Husky(age);
            animal.setName(name);
            return animal;
        } else if (Objects.equals(name, "Kitty")) {
            Animal cat = new Cat(7);
            cat.setName("Kitty");
            return cat;
        }

        Animal rabbit= new Rabbit(age);
        rabbit.setName(name);
        return rabbit;
    }
}
