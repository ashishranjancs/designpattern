package designpatterns.behavioral.strategypattern.examples.duck.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying with wings!");
    }
}
