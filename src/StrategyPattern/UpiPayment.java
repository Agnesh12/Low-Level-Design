package StrategyPattern;

public class UpiPayment implements Payment{
    public void pay(int amount) {
        System.out.println("Paid" + amount + "Upi");
    }
}
