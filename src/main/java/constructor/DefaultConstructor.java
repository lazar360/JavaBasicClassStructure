package constructor;

public class DefaultConstructor {

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        Dog2 dog1 = new Dog2("Jimmy");
        dog1.print();

        Dog2 dog2 = new Dog2("Anthony", "shepard");
        dog2.print();

        Dog2 dog3 = new Dog2("Rex", "german shepard",40 );
        dog3.print();
    }

}
