package designpatterns.behavioral.strategypattern.examples.duck.ducktype;

import designpatterns.behavioral.strategypattern.examples.duck.behavior.FlyNoWay;
import designpatterns.behavioral.strategypattern.examples.duck.behavior.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
