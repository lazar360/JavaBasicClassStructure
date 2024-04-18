public class Dog {
    // private Dog(){}
    // public Dog(){}
    // protected Dog(){}
    // Dog(){}

    private String name;
    private String breed;
    private double weight;

    public Dog(){}
    public Dog (String name){
        this.name = name;
        breed = "husky";
        weight = 30.0;
    }

    public Dog (String name, String breed){
        this.name = name;
        this.breed = breed;
        weight = 30.0;
    }

    public Dog (String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void print(){
        System.out.println(name + " " + breed + " " + weight);
    }

}
