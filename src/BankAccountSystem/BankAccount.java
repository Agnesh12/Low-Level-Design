package BankAccountSystem;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if(initialBalance >= 0) {
            this.balance = initialBalance;
            System.out.println("Initial Money Deposited: " + initialBalance);
        }
        else {
            this.balance = 0;
            System.out.println("The Number must be Positive");
        }
    }
    public BankAccount(){
        this.balance = 0;
    }
    public void deposit(double money) {
        if(money >= 0) {
            balance += money;
            System.out.println("Money deposited: "  + money);
        }
        else {
            System.out.println("The Money has to be psoitive");
        }
    }
    public void withdraw(double money) {
        if(money >= 0) {
            balance -= money;
            System.out.println("Money Withdrawn: " + money);
        }
        else {
            System.out.println("The Withdraw money has to positive");
        }
    }

    public double getBalance() {
        return balance;
    }
}
