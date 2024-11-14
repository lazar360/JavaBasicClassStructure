package inheritance.Main;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Herbivore;
import inheritance.Hop;

public class Rabbit extends Animal implements Herbivore, Hop {


    /*public Rabbit(){
        super;
    }*/ // does not compile because super must be a constructor call

    /*public Rabbit(){
        super().setAge(3);
    }*/ // does not compile because super must be a constructor call

    /*public Rabbit(int age){
        super();
        super.setAge(3);
    }*/ // does not compile because there is no default constructor

    public Rabbit(int age) {
        super(age);
    }

    public Rabbit(){
        this(3);
    }

    @Override
    protected void sayHello() {
        super.sayHello();
    }

    @Override
    public void run() {

    }

    @Override
    protected void printName() {
        System.out.println("I am a rabbit");
    }

    public void printDetails(){
        System.out.println("Rabbit average jump height " + Hop.GetAverageJumpHeight());
    }

    // sayGoodBye does not compile because, default accessor
}
