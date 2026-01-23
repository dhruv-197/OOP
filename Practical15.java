import java.util.Scanner;

class Practical15 {
    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Total Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Total Amount: " + itemTotal);
        System.out.println("Discount (Flat): " + discount);
        System.out.println("Final Bill: " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * (discountPercent / 100);
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Total Amount: " + itemTotal);
        System.out.println("Discount (" + discountPercent + "%): " + discountAmount);
        System.out.println("Final Bill: " + finalAmount);
    }

    public static void main(String[] args) {
        Practical15 mall = new Practical15();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Total: ");
        int total = sc.nextInt();

        System.out.println("\n--- Generating Bills ---");
        
        mall.generateBill(total);
        System.out.println();

        mall.generateBill(total, 50);
        System.out.println();

        mall.generateBill(total, 10.0);

        sc.close();
    }
}