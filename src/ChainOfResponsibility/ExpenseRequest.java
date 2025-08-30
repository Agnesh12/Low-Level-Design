package ChainOfResponsibility;

public class ExpenseRequest {
    public double amount;
    public ExpenseRequest(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
