package ca.uwaterloo.cs446;

import java.util.ArrayList;

abstract class Subject {
    private ArrayList<Observer> observers;
    public Subject() {
        this.observers = new ArrayList<Observer>();
    };
    public void attach(Observer observer) {
        this.observers.add(observer);
    };
    public void sendNotice() {
        for (Observer obs : this.observers){
            obs.update();
        }
    };
    public abstract int getState();
    public void setState(int state) {};
}

abstract class Observer {
    public Observer() {};
    public abstract void update();
    public abstract String getValue();
}

class NumberSubject extends Subject {
    private int state;
    public NumberSubject(int state) {
        this.state = state;
    };
    public int getState() {
        return state;
    };
    public void setState(int state) {
        this.state = state;
        sendNotice();
    };
}

class OctalObserver extends Observer {
    private String octValue;
    private Subject subject;
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    };
    public void update() {
        this.octValue = Integer.toOctalString(this.subject.getState());
    };
    public String getValue() {
        return octValue;
    };
}