package inheritance;

public class Bear extends Animal implements Omnivore{
    public Bear(int age) {
        super(age);
    }

    @Override
    public void run() {
        System.out.println("Bear runs");
    }

    @Override
    protected void printName() {

    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }

   /* @Override
    public void eatPlants() {
        System.out.println("Bear eating plants");
    }*/
}
