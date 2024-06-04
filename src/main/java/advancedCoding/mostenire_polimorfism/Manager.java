package advancedCoding.mostenire_polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private double managerBonus;
    private List<Employee> employeeList = new ArrayList<>();
    public Manager(String name, double baseSalary, Integer yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }
    public Manager(String name, double baseSalary, Integer yearsOfExperience, double managerBonus) {
        super(name, baseSalary, yearsOfExperience);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void joinTeam(Employee employee) {
        System.out.println("Employee " + employee.name + " joined team!");
        this.employeeList.add(employee);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(super.toString());
        sb.append("managerBonus: ").append(managerBonus);
        sb.append(", employeeList: ").append(employeeList);
        return sb.toString();
    }
}
