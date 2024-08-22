package Observer;

import java.util.Vector;

public abstract class NumberGenerator {
    private final Vector observers = new Vector();        // 储存Observer
    public void addObserver(Observer observer) {    // 新增Observer
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // 刪除Observer
        observers.remove(observer);
    }
    public void notifyObservers() {               // 通知Observer

        for (Object observer : observers) {
            Observer o = (Observer) observer;
            o.update(this);
        }
    }
    public abstract int getNumber();                // 取得数值
    public abstract void execute();                 // 产生数值
}

