package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<>();
        ArrayList<String> myList3 = new ArrayList<String>();
        ArrayList<String> myList4 = new ArrayList<>();

        List<String> myList5 = new ArrayList<>(); // using interface as type

        // ArrayList<String> list = new List<>(); // does not compile Class != interface

        List<String> list2 = new ArrayList<>(20);
    }
}
