package constructor;

public class Dog2 {
    // private Dog(){}
    // public Dog(){}
    // protected Dog(){}
    // Dog(){}

    private String name;
    private String breed;
    private double weight;

    public Dog2(){}
    public Dog2(String name){
        /*this.name = name;
        breed = "husky";
        weight = 30.0;*/
        this(name, "husky"); // must be first
        System.out.println("constructor 1");
    }

    public Dog2(String name, String breed){
        /*this.name = name;
        this.breed = breed;
        weight = 30.0;*/
        this(name, breed, 30.0);
        System.out.println("constructor 2");
    }

    public Dog2(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print(){
        System.out.println(name + " " + breed + " " + weight);
    }

}
