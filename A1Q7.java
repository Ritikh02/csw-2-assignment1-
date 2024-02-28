/*Consider a scenario where you are tasked with developing a simple banking application
using Java, employing the concept of polymorphism. Your application should consist of three
classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the
base class with private attributes for account number and balance, along with abstract methods
for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include
an additional attribute for interest rate and override the deposit method to calculate interest, as
well as override the withdrawal method to ensure a sufficient balance. Similarly, the
CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit
attribute and override the withdrawal method to check the overdraft limit. Implement the
classes as described, ensuring proper encapsulation and abstraction. Finally, create a
BankingApplication class (Main) to demonstrate the polymorphic behavior by creating
instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal
operations, and displaying account details. */


abstract class Account {
    private int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount + (amount * interestRate));
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

public class A1Q7 {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(101, 5000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(102, 3000, 2000);

        // Testing deposit and withdrawal operations
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        currentAccount.deposit(500);
        currentAccount.withdraw(4000);

        // Displaying account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
        System.out.println();

        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
        System.out.println("Overdraft Limit: $" + currentAccount.getOverdraftLimit());
    }
}
