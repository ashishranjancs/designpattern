package designpatterns.creational.factorypattern.abstractfactory.pizza.pizza;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza...");
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createClams();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
