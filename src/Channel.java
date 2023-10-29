import java.util.List;
import java.util.ArrayList;
public class Channel {
    private String channelName;
    private List<Observer> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.channelName = name;
    }

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Video '" + videoTitle + "' uploaded to channel " + channelName);
        notifySubscribers(videoTitle);
    }

    private void notifySubscribers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.updateInfo(videoTitle);
        }
    }
}

