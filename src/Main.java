public class Main {
    public static void main(String[] args) {
        Channel channel1 = new Channel("Sam Sulek");
        Channel channel2 = new Channel("НуДопустимИнтересный Канал");
        Channel channel3 = new Channel("David Laid");
        Channel channel4 = new Channel("Ян топлес");

        Subscriber subscriber1 = new Subscriber("User 1");
        Subscriber subscriber2 = new Subscriber("User 2");
        Subscriber subscriber3 = new Subscriber("User 3");
        Subscriber subscriber4 = new Subscriber("User 4");
        Subscriber subscriber5 = new Subscriber("User 5");

        channel1.subscribe(subscriber1);
        channel2.subscribe(subscriber1);
        channel1.subscribe(subscriber3);
        channel3.subscribe(subscriber2);
        channel4.subscribe(subscriber4);
        channel4.subscribe(subscriber5);

        channel1.uploadVideo("Winter Bulk Day 1 - Back and Rear Delts");
        channel2.uploadVideo("Video 2");
        channel3.uploadVideo("Aesthetic videos");
        channel4.uploadVideo("Сон");
        channel1.uploadVideo("End of Fall Cut Day 59 - Chest and Side Delts");
    }
}