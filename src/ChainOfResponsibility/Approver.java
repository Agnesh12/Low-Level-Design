package ChainOfResponsibility;

abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    abstract void approve(ExpenseRequest request);
}
