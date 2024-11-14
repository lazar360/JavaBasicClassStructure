package inheritance;

public abstract class Dog extends Animal implements HasTail{
    public Dog(int age){
        super(age);
        System.out.println("Dog");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }
}
