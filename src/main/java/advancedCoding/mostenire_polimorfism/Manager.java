package advancedCoding.mostenire_polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private double managerBonus;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, double baseSalary, double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }
    public Manager(String name, double baseSalary, double yearsOfExperience, double managerBonus) {
        super(name, baseSalary, yearsOfExperience);
    }

    public void joinTeam(Employee employee) {
        System.out.println("Employee " + employee.name + " joined team!");
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(super.toString());
        sb.append("managerBonus: ").append(managerBonus);
        sb.append(", employees: ").append(employees);
        return sb.toString();
    }
}
