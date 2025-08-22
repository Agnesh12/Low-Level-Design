package StrategyPattern;

public class PayPalPayment implements Payment{
    public void pay(int amount) {
        System.out.println("Paid" + amount + "Using PayPal");
    }
}
