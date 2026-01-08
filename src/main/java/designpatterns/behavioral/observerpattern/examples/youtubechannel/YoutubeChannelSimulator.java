package designpatterns.behavioral.observerpattern.examples.youtubechannel;

public class YoutubeChannelSimulator {
    public static void main(String[] args) {
        Channel channel = new Channel("ranjeetcs");
        Subscriber s1 = new Subscriber(channel,"Ashish");
        Subscriber s2 = new Subscriber(channel,"Ranjeet");
        Subscriber s3 = new Subscriber(channel,"Asif");
        Subscriber s4 = new Subscriber(channel,"Mirnal");
        Subscriber s5 = new Subscriber(channel,"Shyam");


        channel.uploadVideo("Design Pattern in java - Observer Pattern");

    }
}
