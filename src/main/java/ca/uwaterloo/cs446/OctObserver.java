package ca.uwaterloo.cs446;

public class OctObserver extends Observer {
    private String octValue;
    private Subject subject;

    public OctObserver(Subject s) {
        this.subject = s;
        s.attach(this);
    }
    public void update() {
        octValue = Integer.toOctalString(this.subject.getState());

    } 
    public String getValue() {return octValue;}
}
