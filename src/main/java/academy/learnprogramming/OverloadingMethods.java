package academy.learnprogramming;
public class OverloadingMethods {

    public void walk(int miles){}
    public void walk(short feet){}
    public boolean walk(){
        return false;
    }

    void walk(int miles, short feet){}
    public void walk(float miles){}
    // public int walk(float km){} it does not compile
    public void walk(int[] length){}
    // public void walk(int... vars){} does not compile because same parameter type (int[] length = int... vars)

    public static void main(String[] args) {

        run(1);// call run(int length)
        run(1.0);// call run(double length)
        run(1L); // call run(double length)

        jump("test"); //
        jump(25);


    }

    public static void run(int length){}
    public static void run(Integer length){}
    public static void run(double length){}

    public static void jump(String s){
        System.out.println("string");
    }

    public static void jump(Object o){
        System.out.println("Object");
    }

}
