package state;

public class ConcreteStateB extends State {

    public ConcreteStateB(Context context) {
        super.context = context;
    }

    @Override
    public boolean concreteStateA() {
        super.context.setState(new ConcreteStateB(super.context));
        return false;
    }

    @Override
    public boolean concreteStateB() {
        return false;
    }

}
