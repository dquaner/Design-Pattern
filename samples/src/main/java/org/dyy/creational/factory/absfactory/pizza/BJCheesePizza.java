package org.dyy.creational.factory.absfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("preparing..." + name);
    }
}
