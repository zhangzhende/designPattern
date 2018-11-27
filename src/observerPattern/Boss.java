package observerPattern;

import java.util.HashSet;
import java.util.Set;

public class Boss extends Subject {

    private Set<Observer> observers = new HashSet<>();

    /**
     * 增加观察者
     *
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知
     */
    @Override
    public void call() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
