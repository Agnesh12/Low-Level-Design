package BankAccountSystem;

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // start with 1000
        account.deposit(500);   // deposit 500
        account.withdraw(200);  // withdraw 200
        System.out.println("Current balance: " + account.getBalance());
    }
}
