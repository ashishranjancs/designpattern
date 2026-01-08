package designpatterns.behavioral.observerpattern.examples.weathersubscription;

public class StatisticsDisplay implements Observer, DisplayElement{
    private int maxTemp = 200;
    private int minTemp = 0;
    private int maxHumidity = 10;
    private int minHumidity = 30;
    private float maxPressure = 400.0f;
    private float minPressure = 0.0f;
    private int temperature;
    private int humidity;
    private float pressure;
    private int numReadings;
    Subject WeatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.WeatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temperature / numReadings) + "/" + maxTemp + "/" + minTemp);
        System.out.println("Avg/Max/Min humidity = " + (humidity / numReadings) + "/" + maxHumidity + "/" + minHumidity);
        System.out.println("Avg/Max/Min pressure = " + (pressure / numReadings) + "/" + maxPressure + "/" + minPressure);
    }

    @Override
    public void update(int temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        numReadings++;
        display();
    }
}
