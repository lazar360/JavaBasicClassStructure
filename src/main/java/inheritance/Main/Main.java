package inheritance;

public class Main {
    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("rex");
        dog.printDetails();
    }
}
