public class DefaultConstructor {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog("Jimmy");
        dog1.print();

        Dog dog2 = new Dog("Anthony", "shepard");
        dog2.print();

        Dog dog3 = new Dog("Rex", "german shepard",40 );
        dog3.print();
    }

}
