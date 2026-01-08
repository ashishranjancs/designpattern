package designpatterns.creational.factorypattern.abstractfactory.pizza.pizza;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createClams();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
