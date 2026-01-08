package designpatterns.creational.factorypattern.abstractfactory.pizza.pizza;

import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Cheese;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Clams;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Dough;
import designpatterns.creational.factorypattern.abstractfactory.pizza.ingredientfamily.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official pizzaStore Box");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
