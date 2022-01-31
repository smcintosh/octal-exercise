package ca.uwaterloo.cs446;


abstract class Observer {
    protected Subject subject;

    public Observer() {}

    public abstract void update();

    public abstract String getValue();

}