package designpatterns.creational.factorypattern.abstractfactory.pizza.store;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.NYPizzaIngredientFactory;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;
import designpatterns.creational.factorypattern.abstractfactory.pizza.pizza.*;

public class NYPizzaStore extends PizzaStore{
    PizzaIngredientFactory pizzaIngredientFactory;
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New york style cheese pizza");
        }else if(type.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New york style Veggie pizza");
        }else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New york style pepperoni pizza");
        }else if(type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New york style Clam pizza");
        }
        return pizza;
    }
}
