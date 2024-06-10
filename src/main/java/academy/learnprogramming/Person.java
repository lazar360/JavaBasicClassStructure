package academy.learnprogramming;

public class Person{

    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        this("Eric", "Johnson");
    }
    public Person(String firstName, String last){
        this.firstName = firstName;
        lastName = last; // this is optional
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFullName(){
        return firstName +" "+ lastName;
    }

        }
