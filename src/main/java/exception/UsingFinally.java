package exception;

import java.util.Arrays;

public class UsingFinally {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "hello";

        try {
            String element = firstToUppercase(arr);
            System.out.println("element= " + element);
        } catch (NullPointerException npe) {
            System.out.println("Error message= " + npe.getMessage());
        } finally {
            System.out.println("finally block");
        }

        String str = "";
        try {
            // int result = 10/0;
            str += "a";
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";
        System.out.println(str); // acd


    }

    public static String firstToUppercase(String[] array) {
        return array[0].toUpperCase();
    }
}
