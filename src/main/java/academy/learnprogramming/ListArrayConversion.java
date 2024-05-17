package academy.learnprogramming;

import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tony", "Jimmy", "Antony");
        System.out.println(names.getClass().getName());

        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);
        System.out.println(namesArray.getClass().getName());

        String[] stringArray = names.toArray(new String[0]); // auto resize

        String[] anotherStringArray = names.toArray(new String[names.size()]);

        // String[] petsArray = new String[]{"dog", "cat", "parrot"};
        String[] petsArray = {"dog", "cat", "parrot"}; // we can also write like this (anonymous array)

        List<String> petsList = Arrays.asList(petsArray); // !!!!! this is not a copy !!!! (share reference)
        // List<String> petsList = Arrays.asList("dog", "cat", "parrot"); // it returns fix size list

        System.out.println(petsList.size());

        petsList.set(0, "bird"); // it affects both
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky"; // it affects both
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        // petsList.add("newDog"); // throws unsupported operation exception
        // petsList.remove(1); // throws unsupported operation exception

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
        // list.add("four"); // throws unsupported operation exception

        List<String> list2 = List.of("one", "two", "three");
        list2.add("four");
        // System.out.println(list2); // throws unsupported operation exception
    }
}
