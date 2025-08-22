package ObserverPattern;

public class User implements Observer{
    String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String Message) {
        System.out.println(name + "got Notification " + Message);
    }

}
