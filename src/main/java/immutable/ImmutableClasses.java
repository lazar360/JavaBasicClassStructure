package immutable;

public class ImmutableClasses {

    public static void main(String[] args) {

        Complex a = new Complex(5,6);
        System.out.println(a.getReal());
        System.out.println(a.getImaginary());
        // System.out.println(a.real); // does not compile, private accessor
        // System.out.println(a.imaginary); // // does not compile, private accessor
        a.plus(new Complex(2,3));
    }
}
