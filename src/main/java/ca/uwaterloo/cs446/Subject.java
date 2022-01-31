package ca.uwaterloo.cs446;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> obs = new ArrayList<>();

    public void attach(Observer o) {
        obs.add(o);
    }
    public void sendNotice() {
        for (Observer o : obs) {
         o.update();
        }
    }

    public abstract int getState();

    public abstract void setState(int s);
    

}
