package BuilderPattern;

public class PizzaBuilder {
    public String size;
    public String crust;
    public String toppings;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }
    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }
    public Pizza build() {
        return new Pizza(this);
    }
}
