package ca.uwaterloo.cs446;

class NumberSubject extends Subject {
    private int state;

    public NumberSubject(int state) {
        super();
        this.state = state;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        sendNotice();
    }

    
}