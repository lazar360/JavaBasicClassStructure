package academy.learnprogramming;

class Dog{

    private String colour;
    public Dog(String colour){
        System.out.println("constructor");
        this.colour = colour;
    }
    // public void academy.learnprogramming.Dog(){} // compile but this is not a constructor because it has a return type

    public void printColor(){
        System.out.println("color= " + this.colour);
    }
}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight){
        // length = this.length; change nothing because this.length = 0
        this.length = length;
        height =theHeight;
        color = "white";
    }

    public void printInfo(){
        System.out.println("academy.learnprogramming.Cat length= " + length + " academy.learnprogramming.Cat heigth= " + height + " academy.learnprogramming.Cat color= " + color);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {

        Dog dog = new Dog("gray");
        dog.printColor();

        Cat cat = new Cat(10, 12);
        cat.printInfo();
    }
}
