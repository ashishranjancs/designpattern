package designpatterns.behavioral.observerpattern.examples.weathersubscription;

public interface Observer {
    public void update(int temperature, int humidity, float pressure);
}
