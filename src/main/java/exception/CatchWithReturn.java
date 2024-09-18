package exception;

public class CatchWithReturn {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate(){
        /*try {
            return 10/0;
        } catch(ArithmeticException e){
            System.out.println("error"); // first
            return 1; // third and end
        } finally {
            System.out.println("finally");// second
            return 0; // third and end
        }
        // error finally 0
*/
        /*try {
            return 10/0;
        } catch(ArithmeticException e){
            System.out.println("error"); // first
            return 1; // third and end
        } finally {
            System.out.println("finally");// second
            // return 0; // third and end
        }*/
        // error finally 1

        try {
            return 10/0;
        } catch(ArithmeticException e){
            System.out.println("error"); // first
            System.exit(0);
            return 1; // third and end
        } finally {
            System.out.println("finally");// second
            // return 0; // third and end
        }
        // error

        /*try {
            System.exit(0);
            return 10/0;
        } catch(ArithmeticException e){
            System.out.println("error"); // first
            return 1; // third and end
        } finally {
            System.out.println("finally");// second
            // return 0; // third and end
        }*/
        // nothing is printed
    }
}
