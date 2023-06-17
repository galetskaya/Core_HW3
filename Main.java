/*
@autor Stanchu Vladislav
*/

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Denis", "Novikov", "manager", 32, 500, 89521092535L);
        Employee employee2 = new Employee("Tom", "Djerev", "desintegrator pilyi", 30, 1500, 8953425435L);
        Employee employee3 = new Boss("Nick", "Kikov", "Boss", 31, 4000, 89521241535L);

        Employee[] employees = new Employee[]{employee1, employee2, employee3};


        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Boss.salaryUp(employees);
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee);

        }
        System.out.println();

        if (new AgeComparator().compare(employee1, employee2) == -1) {
            System.out.println(employee1.getFirstName() + " младше");
        } else if (new AgeComparator().compare(employee1, employee2) == 1) {
            System.out.println(employee1.getFirstName() + " старше");

        } else{
            System.out.println("одного возраста");
    }
    }
}



