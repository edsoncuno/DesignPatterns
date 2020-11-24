package state;

public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean concreteStateA() {
        return state.concreteStateA();
    }

    public boolean concreteStateB() {
        return state.concreteStateB();
    }

}
