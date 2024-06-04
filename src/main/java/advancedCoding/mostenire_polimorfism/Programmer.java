package advancedCoding.mostenire_polimorfism;

public class Programmer extends Employee{

    private double bonusOverTime;
    public Programmer(String name, double baseSalary, double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }
    public Programmer(String name, double baseSalary, double yearsOfExperience, double bonusOverTime) {
        super(name, baseSalary, yearsOfExperience);
        this.bonusOverTime = bonusOverTime;
    }

    public void setBonusOverTime(double bonusOverTime) {
        this.bonusOverTime = bonusOverTime;
    }

    @Override
    public double calculateSalary() {
        if (bonusOverTime > 500 && this.yearsOfExperience >= 100 ){
            bonusOverTime = 500;
        }
        return super.calculateSalary() + bonusOverTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(super.toString()).append(" bonusOverTime: ").append(bonusOverTime);
        return sb.toString();
    }
}
