package advancedCoding.mostenire_polimorfism;

public class Main {
    public static void main(String[] args) {
        Programmer employee1 = new Programmer("Roby", 8000, 3);
        Employee employee2 = new Programmer("Malone", 9000, 10, 1500);
//        employee1.setBonusOverTime(250.4);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee2.calculateSalary());

        Manager manager1 = new Manager("Dorian", 15000, 10, 10);
        System.out.println(manager1);
        manager1.joinTeam(employee1);
        manager1.joinTeam(employee2);

        System.out.println(manager1.getEmployeeList());

        for (Employee e : manager1.getEmployeeList()) {
            System.out.println(e.calculateSalary());
        }

        Employee tester1 = new Tester("Ginuta", 5000, 2);
        System.out.println(tester1.calculateSalary());
    }
}
