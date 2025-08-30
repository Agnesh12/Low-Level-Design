package FactoryPattern;

public class MuttonPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MuttonPizza();
    }
}
