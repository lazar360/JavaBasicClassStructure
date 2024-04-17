package academy.learnprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class IteratingAndModifyList {
    public static void main(String[] args) {

        List<String> list = createList();
        String str = null;

        /*// listIterator
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); str = listIterator.next()) {

            // remove
            *//*if (Objects.equals(str, "Array 3")) {
                listIterator.remove();
            }*//*

            // modify
            if (Objects.equals(str, "Array 3")) {
                listIterator.set("Array 3 modified");
            }
        }*/

        // for loop
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);

            // remove
            /*if (Objects.equals(tmp, "Array 3")) {
            list.remove(i);
            }*/

            // modify
            if (Objects.equals(tmp, "Array 3")) {
                list.set(i, "Array 3 modified");
            }
        }

        // create a duplicate
        list.add("Array 1");

        // create another duplicate
        list.add("Array 4");

        // remove all duplicates
        List<String> distinctedList = list.stream().distinct().toList();
        System.out.println("list = " + list);
        System.out.println("distinctedList = " + distinctedList);

    }

    private static  ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Array " + i);
        }
        return list;
    }

}
