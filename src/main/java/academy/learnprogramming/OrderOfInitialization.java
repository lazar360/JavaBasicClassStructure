package academy.learnprogramming;

class Demo {

    static { // static 1
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    } // constructor 6 and 9

    static { // static 2
        add(4);
    }

    {
        add(6); // instance initializer 4 and 7
    }

    static { // static 3
        new Demo(); // call instance initializer
    }

    {
        add(8); // instance initializer 5 and 8
    }
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        new Demo(); // call instance initializer and constructor
    }
}
