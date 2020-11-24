package state;

public class ConcreteStateA extends State {

    public ConcreteStateA(Context context) {
        super.context = context;
    }

    @Override
    public boolean concreteStateA() {
        return false;
    }

    @Override
    public boolean concreteStateB() {
        super.context.setState(new ConcreteStateB(super.context));
        return true;
    }

}
