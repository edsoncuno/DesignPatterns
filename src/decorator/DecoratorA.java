package decorator;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super.component = component;
    }

    @Override
    public int operation() {
        return component.operation() + 5;
    }

}
