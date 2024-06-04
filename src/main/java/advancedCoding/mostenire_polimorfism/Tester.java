package advancedCoding.mostenire_polimorfism;

public class Tester extends Employee{

    private int numberOfTests;
    private double testBonus;
    public Tester(String name, double baseSalary, double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }

    public Tester(String name, double baseSalary, double yearsOfExperience, int numberOfTests, double testBonus) {
        super(name, baseSalary, yearsOfExperience);
        this.numberOfTests = numberOfTests;
        this.testBonus = testBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + numberOfTests * testBonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(super.toString());
        sb.append("numberOfTests: ").append(numberOfTests);
        sb.append(", testBonus: ").append(testBonus);
        return sb.toString();
    }
}
