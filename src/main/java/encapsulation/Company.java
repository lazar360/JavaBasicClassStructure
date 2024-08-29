package encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;

    private List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName= " + name);
        Collections.sort(employees);
        System.out.println(employees);
    }

    public String getName() {
        return name;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name == null ? "null" : name;
    }

   public void addEmployee(String name){
        if(name == null){
            System.out.println("Can not add a null employee");
            return;
        }
        employees.add(name);
   }
}
