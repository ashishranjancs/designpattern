package designpatterns.creational.factorypattern.abstractfactory.pizza;


import designpatterns.creational.factorypattern.abstractfactory.pizza.pizza.Pizza;
import designpatterns.creational.factorypattern.abstractfactory.pizza.store.ChicagoPizzaStore;
import designpatterns.creational.factorypattern.abstractfactory.pizza.store.NYPizzaStore;
import designpatterns.creational.factorypattern.abstractfactory.pizza.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ashish Ordered a " + pizza.getName() + " .\n");
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Ranjeet Ordered a " + pizza.getName() + " .\n");
    }
}
