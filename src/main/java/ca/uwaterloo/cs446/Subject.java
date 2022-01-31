package ca.uwaterloo.cs446;

import java.util.ArrayList;

abstract class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void sendNotice() {
        observers.forEach((o) -> {o.update();});
    }

    public abstract int getState();

    public abstract void setState(int state);
}