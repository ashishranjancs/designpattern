package designpatterns.behavioral.strategypattern.examples.duck.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
