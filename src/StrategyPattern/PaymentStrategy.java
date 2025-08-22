package StrategyPattern;

public class PaymentStrategy {
    public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment();
        PaymentManagement creditPay = new PaymentManagement(credit);
        creditPay.pay(1000);
    }
}
