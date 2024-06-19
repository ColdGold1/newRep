package task3.classes;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private List<Observer> observers;
    private String state;

    public Student(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(state);
        }
    }

    public void setState(String state){
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
