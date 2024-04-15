package academy.learnprogramming;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = +3; // + sign is redundant
        double y = -x;

        System.out.println("x = " + x + " y = " + y);

        y = -y; // -1 * y
        System.out.println("x= " + x + " y =" + y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a = " + a + " b = " + b);

        b = !b;
        System.out.println("a = " + a + " b = " + b);

        // int myInt = !5; // does not compile
        // boolean myBoolean = -true; // does not compile
        // boolean z = !0; // does not compile

        // increment and drecrement be carefulle, have higher order than +,-,/,...
        int myInt = 5;
        int otherInt = ++myInt;
        // myInt = 6
        // otherInt = 6
        System.out.println("myInt = " + myInt + " otherInt = " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++;
        // newInt = 6
        // newOtherInt = 5
        System.out.println("newInt = " + newInt + " newOtherInt = " + newOtherInt);

        // Ooops : I have left an ugly piece of code because of this
        int count = 0;
        System.out.println(count); // 0
        System.out.println(++count); // 1
        System.out.println(count); // 1
        System.out.println(count--); // 1
        System.out.println(count); // 0

        // exam questions
        int e = 3;
        int f = ++e * 5 / e -- + --e;
        // f = 4 * 5 / 4 + 2
        // f = 7
        // e = 2
        System.out.println("e = " + e + " f = " + f);

        //------------
        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // h(3) + g(5) * 3 + 2 * g(5 -> 6) - h(3->2) % g(5)
        // h(3) + 15 + 10 - 3
        // i = 25
        // g = 5
        // h = 2
        System.out.println("g = " + g + " h = " + h + " i = " + i);


    }
}
