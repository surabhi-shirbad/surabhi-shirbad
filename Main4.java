
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {


    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw to prevent balance going below 100
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal denied! Balance cannot go below $100.");
        }
    }
}

// Main class to test
public class Main4 {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);

        myAccount.displayBalance(); // Should show 500
        myAccount.withdraw(200);    // Should succeed
        myAccount.displayBalance(); // Should show 300
        myAccount.withdraw(250);    // Should be denied
        myAccount.displayBalance(); // Should still show 300
        myAccount.deposit(100);     // Deposit
        myAccount.displayBalance(); // Should show 400
    }
}
