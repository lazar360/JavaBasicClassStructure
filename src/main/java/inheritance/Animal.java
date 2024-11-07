package inheritance;

// public final abstract class Animal { // does not compile
public abstract class Animal {
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age){
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void printDetails(){
        System.out.println("name= " + getName() + " age= " + getAge());
    }

    protected void sayHello(){
        System.out.println("say Hello");
    }

    void sayGoodBye(){
        System.out.println("say GoodBye");
    }
    public double getAverageAge(){
        return 10;
    }

    public final  void jump(){
        System.out.println("is jumping");
    }

    public abstract void run();

    protected abstract void printName();

}
