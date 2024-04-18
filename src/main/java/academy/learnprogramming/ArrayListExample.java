package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<>();
        ArrayList<String> myList3 = new ArrayList<String>();
        ArrayList<String> myList4 = new ArrayList<>();
        ArrayList<String> myList41 = new ArrayList<String>();

        List<String> myList5 = new ArrayList<>(); // using interface as type
        List<String> list2 = new ArrayList<>(20);
        List list21 = new ArrayList<>();
        List list22 = new ArrayList();

        // ArrayList<> myList42 = new ArrayList<String>(); // does not compile, left operand with empty diamond operators
        // ArrayList<String> list = new List<>(); // does not compile Class != interface
        // List list23 = new ArrayList; // call an empty constructor at least

    }
}
