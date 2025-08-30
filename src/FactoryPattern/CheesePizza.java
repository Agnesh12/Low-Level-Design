package FactoryPattern;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Preparing");
    }
    @Override
    public void bake() {
        System.out.println("Cheese Pizza Baking");
    }
    @Override
    public void cut() {
        System.out.println("Cheese Pizza Cutting");
    }
    @Override
    public void box() {
        System.out.println("Cheese Pizza Boxing");
    }
}
