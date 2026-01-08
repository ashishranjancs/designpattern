package designpatterns.creational.factorypattern.abstractfactory.pizza.pizza;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Clam Pizza...");
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createClams();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
