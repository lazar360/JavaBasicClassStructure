package inheritance.Main;

import inheritance.*;

public class Polymorphism {

    public static void main(String[] args) {

        Husky husky = new Husky(5);

        husky.setName("Rex");

        Dog dog = husky; // another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky;
        System.out.println("tail length= " + hasTail.getTailLength());
        System.out.println("tail length husky= " + husky.getTailLength());

        Animal cat = new Cat(2);
        Cat myCat = (Cat)cat;

        Animal animal = husky;
        System.out.println("tail length2= " + hasTail.getTailLength());
        husky.eat();

        husky.printDetails();
        husky.printName(); // does not compile because method is protected

        // Bear bear = (Bear) "test"; // does not compile because not related in hierarchy
        // Dog newDog = (Dog) cat; // Casting 'cat' to 'Dog' will produce 'ClassCastException' for any non-null value

        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetails();

    }
}
