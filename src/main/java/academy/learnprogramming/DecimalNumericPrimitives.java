package academy.learnprogramming;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        float myNumber = 25.4F;

        // double before = 10_.25; does not compile
        // double after = 10._25; does not compile
        // double first = _10.25; does not compile
        // double first = 10.25_; does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anaotherDouble = 2.54d; // unused so not necessary
        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double myDoubleScientific = 5000.125;
        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("myDoubleScientific = " + myDoubleScientific);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexpi = " + hexPi);

    }
}
