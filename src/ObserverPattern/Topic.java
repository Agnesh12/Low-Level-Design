package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void Subscribe(Observer o) {
        observers.add(o);
    }
    @Override
    public void UnSubscribe(Observer o) {
        observers.remove(o);
    }
    @Override
    public void NotifyUsers(String Message) {
        for (Observer o : observers) {
            o.update(Message);
        }

    }
    public void postMessage(String message) {
        System.out.println("Message posted: " + message);
        NotifyUsers(message);
    }

}
