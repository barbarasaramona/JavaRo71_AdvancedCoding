package advancedCoding.mostenire_polimorfism;

public class Main {
    public static void main(String[] args) {
        Programmer employee1 = new Programmer("Alex", 2540.0, 100.0);
        Employee employee2 = new Programmer("David", 9999.0, 99.0, 550.0);
        System.out.println(employee1);
        employee1.setBonusOverTime(1250.4);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee2.calculateSalary());
        System.out.println(employee1.calculateSalary());

        Manager manager1 = new Manager("Ramona", 25007450.0, 150.0, 2.0);
        System.out.println(manager1);
        manager1.joinTeam(employee1);
        manager1.joinTeam(employee2);

        System.out.println(manager1.getEmployees());


        Employee tester1 = new Tester("Maria", 199.0, 1.0, 500, 0.1);
        System.out.println(tester1);
        manager1.joinTeam(tester1);

        for (Employee e : manager1.getEmployees()) {
            System.out.println(e.calculateSalary());
        }
    }
}
