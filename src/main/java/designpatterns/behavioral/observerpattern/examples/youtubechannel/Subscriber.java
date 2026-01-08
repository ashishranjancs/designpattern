package designpatterns.behavioral.observerpattern.examples.youtubechannel;

public class Subscriber implements Observer{
    String name;
    private Channel channel;

    public Subscriber(Channel channel,String name) {
        this.channel = channel;
        channel.registerSubscriber(this);
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Hey " + name + ", New video uploaded in channel: " + channel.channelName);
    }
}
