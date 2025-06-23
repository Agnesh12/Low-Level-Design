package VendingMachine;

public class VendingMachine {
    InventoryService inventory;
    Payment payment;

    VendingMachine(InventoryService inventory) {
        this.inventory = inventory;
    }

    void setPaymentMethod(Payment payment) {
        this.payment = payment;
    }

    void buy(String productName) {
        if (!inventory.isAvailable(productName)) {
            System.out.println("❌ " + productName + " is out of stock!");
            return;
        }

        Product product = inventory.getProduct(productName);
        boolean paid = payment.pay(product.price);
        if (paid) {
            inventory.removeProduct(productName);
            System.out.println("✅ Dispensed: " + productName);
        }
    }
}
