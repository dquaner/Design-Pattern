package org.dyy.creational.factory.absfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("preparing..." + name);
    }
}
