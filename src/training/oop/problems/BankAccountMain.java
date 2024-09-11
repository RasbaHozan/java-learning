//"Create a BankAccount class with private properties balance and accountNumber. Implement methods to deposit, withdraw, and check balance, ensuring proper encapsulation and validation."
package training.oop.problems;

//BankAccount Class
class BankAccount{
 private int balance;
 private String accountNumber;

 // Constructor
 public BankAccount(String accountNumber, int balance) {
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
 public int getBalance() {
     return balance;
 }

 // Method to get the account number
 public String getAccountNumber() {
     return accountNumber;
 }
}

//Main Class
class BankAccountMain{
 public static void main(String[] args) {
     // Create an instance
 BankAccount account = new BankAccount("xyz123", 5000); // Initialize with account number and balance
//performing operations
     System.out.println(account.deposit(1500));
     System.out.println(account.withdraw(2000));

     // Get values using getter methods
     String accountNumber = account.getAccountNumber();
     int balance = account.getBalance();

     // Print the values
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}
