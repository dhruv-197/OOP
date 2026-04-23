class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 1000.00;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        }
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
        } else {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
    }
}

public class Practical36 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        BankAccount account = new BankAccount();

        try {
            account.deposit(1000.00);
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

