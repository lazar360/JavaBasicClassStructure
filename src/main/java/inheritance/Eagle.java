package inheritance;

public class Eagle extends Bird{

    // Overload modifies parameters and body
    public int fly(int height){
        System.out.println("Ealgle is flying at "+ height + " meters");
        return height;
    }

    // Override modifies body only
    @Override
    public void eat(int amount){
        System.out.println("eagle");
    }

    // Override can modify accessor for higher
    @Override
    public void sayHello(){
        System.out.println("Bird says Hello");
    }
    /*@Override
    void sayHello(){
        System.out.println("Bird says \"Hello\"");
    }*/// does not compile weaker access privilege


}
