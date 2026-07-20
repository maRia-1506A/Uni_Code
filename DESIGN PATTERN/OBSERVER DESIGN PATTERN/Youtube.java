import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String channelName, String videoTitle);
}

// Subject Interface
interface Subject {
    void addObserver(Observer userName);

    void removeObserver(Observer userName);

    void notifyObservers(String Message);
}

// Concrete Subject Class
class YouTubeChannel implements Subject {
    public List<Observer> observers = new ArrayList<>();
    public String channelName;
    public String latestVideoTitle;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addObserver(Observer userName) {
        observers.add(userName);
    }

    @Override
    public void removeObserver(Observer userName) {
        observers.remove(userName);
    }

    @Override
    public void notifyObservers(String Message) {
        for (Observer userName : observers) {
            userName.update(channelName, latestVideoTitle);
        }
    }
}

// Concrete Observer: Subscriber
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(name + " got notification: " + channelName + " uploaded " + videoTitle);
    }
}

// Concrete Observer: NonSubscriber
class NonSubscriber implements Observer {
    private int visitorId;

    public NonSubscriber(int visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Visitor " + visitorId + " saw trending video: " + videoTitle);
    }
}

// Concrete Observer: BellButtonPressedSubscriber
class BellButtonPressedSubscriber implements Observer {
    private String name;
    private boolean hasBellPressed;

    public BellButtonPressedSubscriber(String name, boolean hasBellPressed) {
        this.name = name;
        this.hasBellPressed = hasBellPressed;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        if (hasBellPressed) {
            System.out.println(name + " (Bell 🔔) got instant alert: " + videoTitle);
        }
    }
}

public class Youtube {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Nadir On The Go");

        Observer user1 = new Subscriber("Alice");
        Observer user2 = new NonSubscriber(101);
        Observer user3 = new BellButtonPressedSubscriber("Charlie", true);

        // For Subscriber
        channel.addObserver(user1);
        channel.notifyObservers("");
        channel.removeObserver(user1);

        // For NonSubscriber
        channel.addObserver(user2);
        channel.notifyObservers("");
        channel.removeObserver(user2);

        // For BellButtonPressedSubscriber
        channel.addObserver(user3);
        channel.notifyObservers("");
        channel.removeObserver(user3);
    }
}
