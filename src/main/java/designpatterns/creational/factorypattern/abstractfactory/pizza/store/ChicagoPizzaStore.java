package designpatterns.creational.factorypattern.abstractfactory.pizza.store;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.ChicagoPizzaIngredientFactory;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;
import designpatterns.creational.factorypattern.abstractfactory.pizza.pizza.*;

public class ChicagoPizzaStore extends PizzaStore{
    PizzaIngredientFactory pizzaIngredientFactory;
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        pizzaIngredientFactory= new ChicagoPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago style cheese pizza");
        }else if(type.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago style Veggie pizza");
        }else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style pepperoni pizza");
        }else if(type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style Clam pizza");
        }
        return pizza;
    }
}
