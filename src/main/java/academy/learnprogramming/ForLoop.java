package academy.learnprogramming;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        // System.out.println(i); // does not compile

        System.out.println(); // prints new line sign

        int a;
        for (a = 0; a < 10; a++) {
            System.out.println(a + "");
        }
        System.out.println();
        System.out.println("after the for loop a = " + a);

        // infinite forloop
        /*for (;;){
            System.out.println("Hello");
        }*/

        int x1 = 0;
        for (int y = 0, z = 4; x1 < 5 && y < 10; x1++, y++) {
            System.out.println("y " + y);
        }
        // y = 0, 1, 2, 3, 4
        // x = 5
        System.out.println("x1 " + x1);

        //-------
        int d = 10;
        // for(int e = 0, d = 0; e < 10; e++) // does not compile already initialize
        // for(int e = 0, long d = 0; e < 10; e++) // does not compile because of different type
        for (long z = 0; z < 10; z++) {
        }
        for (double j = 0.0; j < 10; j++) {
        }

        //--------
        int m = 9;
        int n = 1;
        int x = 0;

        while (m > n) {
            // 9 > 1 true
            // 8 > 3 true
            // 7 > 5 true
            // 6 > 7 false
            m--;
            // 8
            // 7
            // 6
            n += 2;
            // 3
            // 5
            // 7
            x += m + n;
            // 11
            // 23
            // 36
        }
        // 36 // D
        System.out.println(x);

        // -----
        int $x = 4;
        long $y = $x * 4 - x++;
        if ($y < 10) System.out.println("Too Low");
        else System.out.println("Just right");
        // else System.out.println("Too high");
        // does not compile

        //---

        int _x = 5;
        System.out.println(_x > 2 ? _x < 4 ? 10 : 8 : 7);
        /*
        ((_x > 2) ? ((_x < 4) ? 10 : 8) : 7)
        true -> (_x < 4) ? 10 : 8
        false -> 8
         */

        //-------
        for(int i=0; i<10;){
            i=i++;
            System.out.println("Hello World");
        }
        // infinite loop

        //---------
        int x11 = 50;
        int x2 = 75;
        boolean b = x11 >=x2;

        if(b=true) System.out.println("Success");
        else System.out.println("Failure");
        // Success

        //----------
        /*int x =1;
        int y = 15;
        while x<10{
            y--;
        }
        x++;
        System.out.println(x+","+y);*/
        // F




    }
}
