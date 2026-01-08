package designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Cheese;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Clams;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Dough;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
