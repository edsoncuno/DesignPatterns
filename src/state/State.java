package state;

public abstract class State {

    protected Context context;

    public abstract boolean concreteStateA();

    public abstract boolean concreteStateB();

}
