package inheritance;

public class Bird {

    public void fly(){
        System.out.println("Bird is flying");
    }

    public void eat(int amount){
        System.out.println("Bird is eating " + amount + " units of food");
    }

    protected void sayHello(){
        System.out.println("Bird says \"Hello\"");
    }
}
