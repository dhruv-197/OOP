class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate = 5.0;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterestEarned() {
        return balance * interestRate / 100;
    }

    public void displayInterestEarned() {
        System.out.printf("Account Holder: %s%n", accountHolderName);
        System.out.printf("Balance: %.2f%n", balance);
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
        System.out.printf("Interest Earned: %.2f%n", calculateInterestEarned());
    }

    public static void updateInterestRate(double newRate) {
        if (newRate < 0) {
            System.out.println("Interest rate cannot be negative.");
            return;
        }
        interestRate = newRate;
    }
}

public class Practical18 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        BankAccount account1 = new BankAccount("Aarav", 12000);
        BankAccount account2 = new BankAccount("Diya", 8500);

        System.out.println("Before updating interest rate:");
        account1.displayInterestEarned();
        System.out.println();
        account2.displayInterestEarned();

        BankAccount.updateInterestRate(6.5);

        System.out.println("\nAfter updating interest rate:");
        account1.displayInterestEarned();
        System.out.println();
        account2.displayInterestEarned();
    }
}
