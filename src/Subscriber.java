public class Subscriber implements Observer {
    private String subscriberName;

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void updateInfo(String videoTitle) {
        System.out.println("Subscriber " + subscriberName + " received a notification: New video '" + videoTitle + "'.");
    }
}
