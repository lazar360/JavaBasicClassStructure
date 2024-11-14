package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author goran on 24/07/2017.
 */
class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", canJump=" + canJump +
                ", canSwim=" + canSwim +
                '}';
    }
}

interface CheckAnimal {
    boolean check(Animal animal);
}

/*class CheckCanJump implements CheckAnimal {

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}*/

interface AnotherCheck {
    boolean check(Animal first, Animal second);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));

       // print(animals, new CheckCanJump());
        /*print(animals, (animal) -> {
            String animal2 ="";
            return animal.canSwim();
        });*/
        print(animals, (animal) -> animal.canSwim());
        print(animals, animal -> !animal.canSwim());
        print(animals.get(0),animals.get(1), (first, second)-> first.canJump() && second.canJump());

        List<Animal> filteredList = animals.stream()
                .filter(animal -> !animal.getType().startsWith("f"))
                .collect(Collectors.toList());
        
        // filteredList.forEach(System.out::println);
        System.out.println(filteredList);
        
    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }

        System.out.println();
    }
}
