package advancedCoding.mostenire_polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private Double managerBonus;
    private List<Employee> employees = new ArrayList<>();
    public Manager(String name, Double baseSalary, Double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }
    public Manager(String name, Double baseSalary, Double yearsOfExperience, Double managerBonus) {
        super(name, baseSalary, yearsOfExperience);
        this.managerBonus = managerBonus;
    }

    public void joinTeam(Employee employee) {
        System.out.println("Employee: " + employee.name + " joined team!");
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return super.toString() +
                "managerBonus=" + managerBonus +
                ", employees=" + employees;
    }
}
