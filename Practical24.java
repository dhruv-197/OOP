class Employee {

    String name;
    String department;

    Employee(String n, String d) {
        name = n;
        department = d;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}


class Manager extends Employee {

    int teamSize;
    String projectName;

    Manager(String n, String d, int t, String p) {
        super(n, d);
        teamSize = t;
        projectName = p;
    }

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}


public class Practical24 {

    public static void main(String[] args) {

        Employee e = new Employee("Rahul", "IT");
        Manager m = new Manager("Amit", "Software", 5, "Bank Project");

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println();

        System.out.println("Manager Details:");
        m.displayDetails();
    }
}