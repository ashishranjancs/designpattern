package designpatterns.creational.factorypattern.factorymethod.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String saucing;
    ArrayList<String> topping = new ArrayList<>();

    public void prepare(){
        System.out.println("Prepare your Pizza "+ name);
        System.out.println("Tossing Dough... ");
        System.out.println("Adding Sauce... ");
        System.out.println("Adding topping... ");
        for(String top: topping){
            System.out.println(" "+top);
        }
    }
    public void bake(){
        System.out.println("Baking your Pizza for 25 minutes at 350...");
    }
    public void cut(){
        System.out.println("cutting your Pizza into diagonal slices...");
    }
    public void box(){
        System.out.println("Placing Pizza in official pizza store box...");
    }
    public String getName(){
        return name;
    }
}
