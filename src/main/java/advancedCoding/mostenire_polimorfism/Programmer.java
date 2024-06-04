package advancedCoding.mostenire_polimorfism;

public class Programmer extends Employee{
    private Double bonusOverTime;
    public Programmer(String name, Double baseSalary, Double yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }
    public Programmer(String name, Double baseSalary, Double yearsOfExperience, Double bonusOverTime) {
        super(name, baseSalary, yearsOfExperience);
        this.bonusOverTime = bonusOverTime;
    }

    public void setBonusOverTime(Double bonusOverTime) {
        this.bonusOverTime = bonusOverTime;
    }

    @Override
    public double calculateSalary() {
        if (bonusOverTime > 500){
            bonusOverTime = 500.0;
        }
        return super.calculateSalary() + bonusOverTime;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bonusOverTime=" + bonusOverTime;
    }
}
