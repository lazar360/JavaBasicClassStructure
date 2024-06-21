package academy.learnprogramming;

public class Static {

    private String name = "Static";

    public static void one(){}
    public static void two(){}
    public static void three(){
        one();
        two();
        // four(); does not compile
    }

    // public static void four(){ // name is not in static context
    public void four(){
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        Static.two();
        Static.three();
        // Static.four(); does not compile, four is not in static context
        // Must have an instance of the class
        Static myInstance = new Static();
        myInstance.four();
        new Static().four();
    }
}
