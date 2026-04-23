class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;

        System.out.println("Account Opened Successfully");
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}


class SavingAccount extends BankAccount {

    double interestRate = 5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
    }
}


class FixedDepositAccount extends BankAccount {

    int years = 2;
    double rate = 7;

    void maturityAmount() {
        double maturity = balance + (balance * rate * years) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}


public class Practical23 {

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");

        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Rahul", 10000);
        s.deposit(2000);
        s.withdraw(1500);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Amit", 20000);
        f.deposit(5000);
        f.checkBalance();
        f.maturityAmount();
    }
}
