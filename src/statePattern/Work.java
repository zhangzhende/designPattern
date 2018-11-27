package statePattern;

public class Work {
    private int hour;
    private AbstractState state;
    private boolean finished;

    public Work() {
        state = new BeforenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
