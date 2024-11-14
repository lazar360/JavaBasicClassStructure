package inheritance;

public class Husky extends Dog{
    public Husky(int age){
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        // super.eat();
        System.out.println("Dog eating");
    }

    @Override
    public void run() {

    }

    @Override
    public void printName() {
        System.out.println("name= " + getName());
    }

    @Override
    public int getTailLength() {
        return 10;
    }

    // public void jump // does not compile, can not override a final method


}
