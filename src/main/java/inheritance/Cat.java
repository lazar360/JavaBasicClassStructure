package inheritance;

public class Cat extends Animal implements Run{

  protected int test;
    public Cat(int age){
        super(age);
        System.out.println("Cat");
    }

    @Override
    public void run() {

    }

    @Override
    protected void printName() {

    }
}
