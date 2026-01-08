package designpatterns.behavioral.strategypattern.examples.duck.ducktype;

import designpatterns.behavioral.strategypattern.examples.duck.behavior.FlyWithWings;
import designpatterns.behavioral.strategypattern.examples.duck.behavior.Quack;

public class MallarDuck extends Duck{

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallar Duck");
    }
}
