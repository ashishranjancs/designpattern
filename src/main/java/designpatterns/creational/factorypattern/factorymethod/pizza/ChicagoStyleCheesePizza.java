package designpatterns.creational.factorypattern.factorymethod.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese Pizza";
        dough = "Thick crust";
        saucing = "Marigano sauce";
        topping.add("carmel cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
