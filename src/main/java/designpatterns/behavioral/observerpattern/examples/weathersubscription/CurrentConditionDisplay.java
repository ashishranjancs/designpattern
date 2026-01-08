package designpatterns.behavioral.observerpattern.examples.weathersubscription;

public class CurrentConditionDisplay  implements Observer, DisplayElement{
    private int temperature;
    private int humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " Pa pressure");
    }

    @Override
    public void update(int temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
