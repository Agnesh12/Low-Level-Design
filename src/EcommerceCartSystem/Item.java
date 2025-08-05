package EcommerceCartSystem;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return quantity * price;
    }
}
