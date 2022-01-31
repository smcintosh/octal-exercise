package ca.uwaterloo.cs446;

class OctObserver extends Observer {
    private String octValue;

    public OctObserver(Subject subject) {
        super();
        this.subject = subject;
        subject.attach(this);
        this.octValue = "";
    }

    @Override
    public void update() {
        octValue = Integer.toOctalString(this.subject.getState());
    }

    @Override
    public String getValue() {
        return octValue;
    }

}