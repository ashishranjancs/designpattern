package designpatterns.creational.factorypattern.factorymethod.pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese"))
            return new NYStyleCheesePizza();
        else if(type.equalsIgnoreCase("clam"))
            return new NYStyleCheesePizza();
        return null;
    }
}
