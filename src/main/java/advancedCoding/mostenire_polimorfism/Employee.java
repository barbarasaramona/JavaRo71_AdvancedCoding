package advancedCoding.mostenire_polimorfism;

public class Employee {
    protected String name;
    protected double baseSalary;
    protected Integer yearsOfExperience;

    public double calculateSalary() {
        System.out.println(this.getClass().getSimpleName() + this.name + ": ");
        return this.baseSalary;
    }

    public Employee(String name, double baseSalary, Integer yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("name: '").append(name).append('\'');
        sb.append(", baseSalary: ").append(baseSalary);
        sb.append(", yearsOfExperience: ").append(yearsOfExperience);
        return sb.toString();
    }
}
