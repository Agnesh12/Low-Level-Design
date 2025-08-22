package ObserverPattern;

public class ObserverManager {
    public static void main(String[] args) {
        Topic topic = new Topic();

        User u1 = new User("Alice ");
        User u2 = new User("Bob ");

        topic.Subscribe(u1);
        topic.Subscribe(u2);

        topic.postMessage("Hello, Subscribers!");

        topic.UnSubscribe(u2);

        topic.postMessage("Another message!");
    }
}
