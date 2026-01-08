package designpatterns.behavioral.strategypattern.examples.duck.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
