package VendingMachine;

import java.util.HashMap;

public class InventoryService {
    HashMap<String, Integer> stock = new HashMap<>();
    HashMap<String, Product> products = new HashMap<>();

    void addProduct(Product product, int quantity) {
        products.put(product.name, product);
        stock.put(product.name, stock.getOrDefault(product.name, 0) + quantity);
    }

    boolean isAvailable(String productName) {
        return stock.getOrDefault(productName, 0) > 0;
    }

    Product getProduct(String productName) {
        return products.get(productName);
    }

    void removeProduct(String productName) {
        if (isAvailable(productName)) {
            stock.put(productName, stock.get(productName) - 1);
        }
    }
}
