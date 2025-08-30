package FactoryPattern;

public class PizzaManager {
    public static void main(String[] args) {
        PizzaFactory CheesePizza = new CheesePizzaFactory();
        Pizza pizza = CheesePizza.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
    }
}
