package designpatterns.behavioral.observerpattern.examples.youtubechannel;

public interface Subject {

    public void registerSubscriber(Subscriber sub);
    public void unRegisterSubscriber(Subscriber sub);
    public void notifySubscriber();
}
