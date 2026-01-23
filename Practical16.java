import java.util.Scanner;

class Practical16 {

    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Home Loan EMI: " + String.format("%.2f", emi));
    }

    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Vehicle Loan EMI: " + String.format("%.2f", emi));
    }

    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Personal Loan EMI (Fixed 10%): " + String.format("%.2f", emi));
    }

    public static void main(String[] args) {
        Practical16 loan = new Practical16();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Home Loan ---");
        System.out.print("Enter Principal, Time(yrs), Rate: ");
        loan.calculateEMI(sc.nextInt(), sc.nextInt(), sc.nextFloat());

        System.out.println("\n--- Vehicle Loan ---");
        System.out.print("Enter Principal, Time(yrs), Rate: ");
        loan.calculateEMI(sc.nextDouble(), sc.nextInt(), sc.nextDouble());

        System.out.println("\n--- Personal Loan ---");
        System.out.print("Enter Principal, Time(yrs): ");
        loan.calculateEMI(sc.nextInt(), sc.nextInt());

        sc.close();
    }
}