package designpatterns.behavioral.observerpattern.examples.youtubechannel;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    String channelName;
    String videoTitle;
    public List<Subscriber> subscribers;

    public Channel(String channelName) {
        this.subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void registerSubscriber(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void unRegisterSubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers){
            subscriber.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.videoTitle = videoTitle;
        System.out.println("Video uploaded from Channel: "+ channelName +" Title: " + videoTitle);
        notifySubscriber();
    }
}
