package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    public String name;
    public List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName= " + name);
        Collections.sort(employees);
    }
}
