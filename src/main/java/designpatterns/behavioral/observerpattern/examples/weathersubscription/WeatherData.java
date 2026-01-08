package designpatterns.behavioral.observerpattern.examples.weathersubscription;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private int temperature;
    private int humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
    }
}
