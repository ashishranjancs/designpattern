package designpatterns.creational.factorypattern.factorymethod.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Cheese Pizza";
        dough = " Thin crust";
        saucing = " tomato chilli";
        topping.add("Gratted reganio cheese");
    }
}
