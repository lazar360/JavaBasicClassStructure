package inheritance;

public interface Carnivore {
    default void eatMeat(){
        System.out.println("eat meat");
    }
}
