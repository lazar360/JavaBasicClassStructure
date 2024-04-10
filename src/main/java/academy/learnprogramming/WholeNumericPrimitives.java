package academy.learnprogramming;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 32_123_456_789L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;
        int firstOctal = 010; // 8 in decimal
        int secondOctal = 022;// 18 in decimal
        int sumOct = firstOctal + secondOctal;
        System.out.println("firstOctal = " + firstOctal + " - secondOctal = " + secondOctal);
        System.out.println("sum firstOctal+secondOctal " + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; //45 decimal - 2d hex
        System.out.println("first = " + firstHex + " - secondHex = " + secondHex);
        System.out.println("sum = " + Integer.toHexString(sumHex));

        // binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 7 decimal
        System.out.println("first= " + firstBin + " - secondBin = " + secondBin);
        System.out.println("decimalSum = " + sumBin + " - BinSum = " + Integer.toBinaryString(sumBin));


    }
}
