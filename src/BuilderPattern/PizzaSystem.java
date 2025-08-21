package BuilderPattern;

public class PizzaSystem {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder()
                .setSize("Large")
                .setCrust("Cheese")
                .setToppings("Meat")
                .build();
        System.out.println(pizza1);

    }
}
