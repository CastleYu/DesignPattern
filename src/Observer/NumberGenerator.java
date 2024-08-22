package Observer;

import java.util.Vector;

public abstract class NumberGenerator {
    private final Vector observers = new Vector();        // ����Observer
    public void addObserver(Observer observer) {    // ����Observer
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // �h��Observer
        observers.remove(observer);
    }
    public void notifyObservers() {               // ֪ͨObserver

        for (Object observer : observers) {
            Observer o = (Observer) observer;
            o.update(this);
        }
    }
    public abstract int getNumber();                // ȡ����ֵ
    public abstract void execute();                 // ������ֵ
}

