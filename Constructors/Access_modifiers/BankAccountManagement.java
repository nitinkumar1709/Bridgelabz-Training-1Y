class BankAccount {
    
    public int accountNumber;       
    protected String accountHolder; 
    private double balance;         

    
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }

    
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: $" + getBalance());        
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount(101, "Alice", 1000);
        System.out.println("--- Bank Account Details ---");
        b1.displayDetails();
        System.out.println();

        
        b1.deposit(500);
        b1.withdraw(200);
        System.out.println("Updated Account Details:");
        b1.displayDetails();
        System.out.println();

        
        SavingsAccount sa = new SavingsAccount(202, "Bob", 2000, 5.0);
        sa.displaySavingsDetails();
    }
}