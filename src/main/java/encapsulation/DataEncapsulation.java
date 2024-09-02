package encapsulation;

import java.util.List;

public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("My company");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);
        company.setName(null);
        company.printSorted();
        /*company.name = null;
        company.printSorted();*/
        /*company.employees = null;
        company.printSorted();*/
    }
}
