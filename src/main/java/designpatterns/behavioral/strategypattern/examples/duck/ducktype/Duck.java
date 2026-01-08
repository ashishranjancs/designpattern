package designpatterns.behavioral.strategypattern.examples.duck.ducktype;

import designpatterns.behavioral.strategypattern.examples.duck.behavior.FlyBehavior;
import designpatterns.behavioral.strategypattern.examples.duck.behavior.QuackBehavior;
import lombok.Setter;

public abstract class Duck {

    @Setter
    FlyBehavior flyBehavior;
    @Setter
    QuackBehavior quackBehavior;


    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

}
