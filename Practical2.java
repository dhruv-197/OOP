import java.util.Scanner;

class Practical2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double D = a * d - b * c;

        if (D == 0) {
            System.out.println("The system has no unique solution (denominator is zero).");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;

            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        scanner.close();
    }
}
