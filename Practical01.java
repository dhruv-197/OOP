import java.util.Scanner;

class Practical01 {
    public static void main(String args[]) {
        System.out.println("Dhruv Soni - 240390107005");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("Distance in feet: %.2f%n", feet);

        scanner.close();
    }
}

