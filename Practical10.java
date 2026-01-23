import java.util.Scanner;

class Practical10 {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeName = input.nextLine();
        System.out.print("Enter Employee Salary: ");
        employeeSalary = input.nextDouble();

        input.close(); 
    }

    public void displayEmployeeData() {
    System.out.println("\nEmployee Details:");
    System.out.println("Name: " + employeeName);
    System.out.printf("Salary: %.2f\n", employeeSalary);
}

    public static void main(String[] args) {
        Practical10 emp = new Practical10();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}