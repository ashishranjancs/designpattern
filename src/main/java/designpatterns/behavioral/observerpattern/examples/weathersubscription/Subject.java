package designpatterns.behavioral.observerpattern.examples.weathersubscription;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
