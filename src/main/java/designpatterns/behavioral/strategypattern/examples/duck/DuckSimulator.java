package designpatterns.behavioral.strategypattern.examples.duck;

import designpatterns.behavioral.strategypattern.examples.duck.behavior.FlyWithWings;
import designpatterns.behavioral.strategypattern.examples.duck.ducktype.Duck;
import designpatterns.behavioral.strategypattern.examples.duck.ducktype.MallarDuck;
import designpatterns.behavioral.strategypattern.examples.duck.ducktype.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        // Changing behavior at runtime
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
    }
}
