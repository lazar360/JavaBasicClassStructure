package academy.learnprogramming;

public class WhileLoop {
    public static void main(String[] args) {
        int spaceOnHdd = 5;

        while (spaceOnHdd > 0) {
            System.out.println("spaceOnHdd " + spaceOnHdd--);
        }

        // endless loop
        int x = 2;
        int y = 5;
        // while(x<10) y++;

        // to fix that add x increment
        while (x < 10) {
            y++;
            x++;
        }
        System.out.println("x " + x + "y " + y);

        int a = 5;
        int b = 7;

        // a is < 6, while loop wil not execute
        while(a>6){
            b+=2;
            a++;
        }

        a = a > 6 ? a++ : b--;
        // a = 7
        // b = 6
        System.out.println("a " + a + "b " + b + " , " + (a+b));
    }
}
