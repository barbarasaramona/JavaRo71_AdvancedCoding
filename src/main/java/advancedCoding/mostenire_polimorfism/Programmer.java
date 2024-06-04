package advancedCoding.mostenire_polimorfism;

public class Programmer extends Employee{

    private double bonusOverTime;
    public Programmer(String name, double baseSalary, Integer yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }

    public Programmer(String name, double baseSalary, Integer yearsOfExperience, double bonusOverTime) {
        super(name, baseSalary, yearsOfExperience);
        this.bonusOverTime = bonusOverTime;
    }

    public void setBonusOverTime(double bonusOverTime) {
        this.bonusOverTime = bonusOverTime;
    }

    @Override
    public double calculateSalary() {
        System.out.print(this.name + ": ");
        if (bonusOverTime > 500 && this.yearsOfExperience > 3)
            bonusOverTime = 500;
        return super.calculateSalary() + bonusOverTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(super.toString()).append(" bonusOverTime: ").append(bonusOverTime);
        return sb.toString();
    }
}
