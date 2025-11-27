/*Q1. Create a BankAccount class
•	Fields: accountNumber, holderName, balance
•	Methods: deposit(), withdraw(), showDetails()
•	Create two accounts and perform operations.*/



class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    // Constructor
    BankAccount(String accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = bal;
    }

    // Deposit method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited.");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Show account details
    void showDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------");
    }
}

// Main class
public class BankAccountDemo {
    public static void main(String args[]) {

        // Creating two accounts
        BankAccount acc1 = new BankAccount("101", "Vaibhavi", 4000);
        BankAccount acc2 = new BankAccount("102", "Shital", 2000);

        // Operations on Account 1
        acc1.showDetails();
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.showDetails();

        // Operations on Account 2
        acc2.showDetails();
        acc2.deposit(500);
        acc2.withdraw(4000);
        acc2.showDetails();
    }
}
