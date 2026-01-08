package designpatterns.creational.factorypattern.factorymethod.pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equalsIgnoreCase("clam"))
            return new ChicagoStyleCheesePizza();
        return null;
    }
}
