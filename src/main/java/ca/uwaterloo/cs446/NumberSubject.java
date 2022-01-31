package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    private int state;

    public NumberSubject(int state) {
        this.state = state;
    }

    public int getState() {return state;}

    public void setState(int s) {this.state = s; sendNotice();}


}
