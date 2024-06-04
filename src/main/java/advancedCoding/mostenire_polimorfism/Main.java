package advancedCoding.mostenire_polimorfism;

import java.lang.management.MemoryNotificationInfo;

public class Main {
    public static void main(String[] args) {
        Programmer employee1 = new Programmer("Danutz", 2540.00, 100);
        Employee employee2 = new Programmer("David", 9999,99, 550);

        System.out.println(employee1);
        employee1.setBonusOverTime(1250.4);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee2.calculateSalary());
        System.out.println(employee1.calculateSalary());

        Manager manager1 = new Manager("Ramona", 25, 150, 2);
        System.out.println(manager1);
        manager1.joinTeam(employee1);
        manager1.joinTeam(employee2);

        System.out.println(manager1.getEmployees());


        Employee tester1 = new Tester("Maria", 199, 1, 500, 0.1);
        System.out.println(tester1.calculateSalary());
        manager1.joinTeam(tester1);

        for (Employee e : manager1.getEmployees()) {
            System.out.println(e.calculateSalary());
        }

    }
}
