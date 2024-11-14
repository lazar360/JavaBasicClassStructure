package inheritance.Main;

import inheritance.*;

public class Main {
    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        /*Dog dog = new Dog(3);
        dog.setName("rex");
        dog.printDetails();*/

        Rabbit rabbit = new Rabbit(1);
        rabbit.sayHello();
        // rabbit.sayGoodBye does not compile
        rabbit.eatPlants();
        rabbit.printDetails();

        Bear bear = new Bear(3);
        bear.eatPlants();

        Shetland shetland = new Shetland();
        shetland.SayHello();

    }
}
