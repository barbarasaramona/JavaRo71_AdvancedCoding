package advancedCoding.mostenire_polimorfism;

public class Employee {

    protected String name;
    protected Double baseSalary;
    protected Double yearsOfExperience;

    public double calculateSalary() {
        System.out.println(this.getClass().getSimpleName() + ", " + this.name + ": ");
        return this.baseSalary;
    }

    public Employee(String name, Double baseSalary, Double yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", yearsOfExperience=" + yearsOfExperience;
    }
}
