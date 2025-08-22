package StrategyPattern;

public class PaymentManagement {
    private Payment payment;

    public PaymentManagement(Payment payment) {
        this.payment = payment;
    }
    public void pay(int amount) {
        payment.pay(amount);
    }
}
