package advancedCoding.mostenire_polimorfism;

public class Tester extends Employee{
    private int numberOfTests;
    private double testBonus;

    public Tester(String name, Double baseSalary, Double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }

    public Tester(String name, Double baseSalary, Double yearsOfExperience, int numberOfTests, double testBonus) {
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
        return super.toString() +
                "numberOfTests=" + numberOfTests +
                ", testBonus=" + testBonus;
    }
}
