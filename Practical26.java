import java.util.Scanner;

class Payment {

    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {

    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}
class UPIPayment extends Payment {

    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class Practical26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int amount;

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else {
            p = new UPIPayment();
        }

        p.processPayment(amount);

        sc.close(); 
    }
}