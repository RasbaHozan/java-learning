package training.oop.problems;

public class BankAccount {
	
	//private fields
    private int balance;
    private String accountNumber; 

    // Constructor
     BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit an amount
    public String deposit(int amount) {
        if (amount <= 0) {
            return "Amount must be greater than 0";
        }
        balance += amount;
        return "Successfully deposited " + amount + ".";
    }

    // Method to withdraw an amount
    public String withdraw(int amount) {
        if (amount <= 0) {
            return "Invalid withdrawal amount";
        }
        if (amount > balance) {
            return "Insufficient balance";
        }
        balance -= amount;
        return "Successfully withdrew " + amount + ".";
    }

    // Method to check the balance
    public int checkBalance() {
        return balance;
    }

    // Method to get the account number 
    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123xyz", 5000);

        System.out.println(account1.deposit(500));
        System.out.println(account1.withdraw(0));
        System.out.println(account1.withdraw(15000));
        System.out.println(account1.withdraw(2000));

        // Check balance
        
        System.out.println("Current balance for account number " + account1.getAccountNumber() + ": " + account1.checkBalance());
    }
}
