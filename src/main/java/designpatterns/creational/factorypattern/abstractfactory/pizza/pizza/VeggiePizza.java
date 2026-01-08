package designpatterns.creational.factorypattern.abstractfactory.pizza.pizza;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza...");
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createClams();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
