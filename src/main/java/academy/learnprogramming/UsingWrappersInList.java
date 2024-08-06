package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {
    public static void main(String[] args) {
        // List<double> doubleList = new ArrayList<>(); // does not compile because arrayList does not work with primitive
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(5.5)); // autoboxing
        doubleList.remove(5.5);
        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers);
        // int number = numbers.get(0); // throws a NullPointerException

        List<Integer> nums = new ArrayList<>();
        nums.add(1);// index 0
        nums.add(2);// index 1
        nums.remove(1); // !!!!!!!!!!this removes element at /!\ index /!\ 1 !!!!!!!!!!!!-> 2 was removed
        System.out.println(nums); // 1

    }
}
