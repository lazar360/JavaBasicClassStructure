package academy.learnprogramming;

public class TernaryOperator {
    public static void main(String[] args) {

        int x = 10;
        int y = x > 5 ? 2*x :4*x;
        System.out.println(y);

        // int myInt = y < 10 ? 5 : "Test"; // does not compile

        int a = 1;
        int b = 1;
        int z = a < 10 ? a++ : b++;
        System.out.println(a +" " + b +" "+ z);

        int d = 1;
        int e = 2;
        int f = 3;

        if(d<10) f = d++ < 1 ? e++ : f++;
         else f = (d+e) < 2 ? d++ : e++;

        // d = 2
        // e = 2
        // f = 3
        System.out.println(d +","+e+","+f);
    }
}
