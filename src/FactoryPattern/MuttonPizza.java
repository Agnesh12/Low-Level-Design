package FactoryPattern;

public class MuttonPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Mutton Pizza Preparing");
    }
    @Override
    public void bake() {
        System.out.println("Mutton Pizza Baking");
    }
    @Override
    public void cut() {
        System.out.println("Mutton Pizza Cutting");
    }
    @Override
    public void box() {
        System.out.println("Mutton Pizza Boxing");
    }
}
