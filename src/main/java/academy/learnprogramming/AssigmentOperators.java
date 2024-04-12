package academy.learnprogramming;

public class AssigmentOperators {
    public static void main(String[] args) {

        // int x = 1.0; // does not compile
        // short x = 1234567;
        // long t = 19234567890;

        int x = (int) 1.0;
        short y = (short)1234567;
        int z = (int) 9f;
        long t = 19234567890L;

        System.out.println("x = "+ x + " y = " + y + " z = " + z + " t = " + t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondbyte = -128;

        System.out.println("myByte= "  + myByte + " mySecondByte = " + mySecondbyte);

       // myByte = myByte + 1 // does not compile because myByte is automatically promoted into int and byte is expected
        // myByte = (byte)(myByte + 1);
        myByte++;
        mySecondbyte--;

        System.out.println("myByte = " + myByte + " mySecondbyte = " + mySecondbyte);

        short a = 10;
        short b = 20;
        short c = (short)(a*b);
        System.out.println("c = " + c);
    }
}
