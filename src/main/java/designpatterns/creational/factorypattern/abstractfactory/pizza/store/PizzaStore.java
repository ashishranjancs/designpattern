package designpatterns.creational.factorypattern.abstractfactory.pizza.store;

import designpatterns.creational.factorypattern.abstractfactory.pizza.pizza.Pizza;

public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
