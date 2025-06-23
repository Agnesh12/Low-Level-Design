package VendingMachine;

public class Main {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();
        inventory.addProduct(new Product("Coke", 30), 2);
        inventory.addProduct(new Product("Pepsi", 35), 1);

        VendingMachine machine = new VendingMachine(inventory);

        machine.setPaymentMethod(new CashPayment());

        machine.buy("Coke");
        machine.buy("Pepsi");
        machine.buy("Pepsi");  // Should say out of stock
    }
}
