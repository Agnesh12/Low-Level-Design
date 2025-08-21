package BuilderPattern;

public class Pizza {
    private String size;
    private String crust;
    private String toppings;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
    }
    @Override
    public String toString() {
        return size + " Pizza with " + crust + " crust and " + toppings;
    }
}

