package academy.learnprogramming;

import java.util.*;

public class IteratingAndModifyList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(createArray()));
        String str = null;

        // listIterator
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); str = listIterator.next()) {

            // remove
            /*if (Objects.equals(str, "Array 3")) {
                listIterator.remove();
            }*/

            // modify
            if (Objects.equals(str, "Array 3")) {
                listIterator.set("Array 3 modified");
            }
        }
        System.out.println(list);
    }

    private static String[] createArray() {
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }

}
