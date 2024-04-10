package academy.learnprogramming;

public class Main {

    /**
     * This is main method
     * @param args
     */
    public static void main(String[] args) {

        // Printing size of arguments
        System.out.println("args-size = " + args.length);

        /*
        Printing arguments
         */
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]="+ args[i]);
        }

        System.out.println(sum(1,2));
    }

    /**
     * Calculates sum of two integers
     *
     * @param a
     * @param b
     * @return sum
     */
    public static int sum(int a, int b){
        return a+b;
    }

}
