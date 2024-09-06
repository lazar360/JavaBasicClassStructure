package academy.learnprogramming;

public class DefaultInitialization {

    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
     static double myDouble;
     static char myChar;

    public static void main(String[] args) {
        int [] arr1 = new int[8];
        System.out.println(myBoolean); // false
        System.out.println(myByte); // 0
        System.out.println(myShort); // 0
        System.out.println(myInt);// 0
        System.out.println(myLong); // 0
        System.out.println(myFloat); //0.0
        System.out.println(myDouble); // 0.0
        System.out.println(myChar); //
        String [] arr = new String[7];
        System.out.println(arr[0]);
    }
}
