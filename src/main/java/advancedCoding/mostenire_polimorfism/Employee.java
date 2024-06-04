package advancedCoding.mostenire_polimorfism;

public class Employee {
    protected String name;
    protected double baseSalary;
    protected double yearsOfExperience;

    public double calculateSalary() {
        System.out.print(this.getClass().getSimpleName() + ", " + this.name + ": ");
        return this.baseSalary;
    }

    public Employee(String name, double baseSalary, double yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Name: '").append(name).append('\'');
        sb.append(", Salary: ").append(baseSalary);
        sb.append(", Experience: ").append(yearsOfExperience);
        return sb.toString();
    }
}
