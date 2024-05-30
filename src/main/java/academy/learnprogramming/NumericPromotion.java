package academy.learnprogramming;

public class NumericPromotion {

    public static void main(String[] args) {
        /*
        The 4 rules :
        1- different data types -> java promote to the bigger one
        2- integral vs floating-point -> java promote the integral (byte, short, int, long) to floating point
        3- small data types (byte, short, char) are first promoted to int (arithmetic operator)
        4- after all promotion, result value has the same data type than operand
         */

        // promotion is converting smaller into bigger type
        int x = 5;
        double y = 10.55;
        System.out.println("x + y =" + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b +c + d;
        System.out.println("result = " + result);

        // casting is converting bigger type into smaller type
        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;
        System.out.println("result = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;
        int intResult = anotherInt + myByte;
        byte byteResult =  (byte)(anotherInt + myByte);
        System.out.println("intResult = " + intResult + " byteResult = " + byteResult); // overflow

        short myShort1 = 14;
        short myShort2 = 6;
        int resultShort = myShort1+myShort2; // rule 3 in action : was converted in int

    }
}
