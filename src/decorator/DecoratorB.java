package decorator;

public class DecoratorB extends Decorator {

    public DecoratorB(Component component) {
        super.component = component;
    }

    @Override
    public int operation() {
        return component.operation() + 10;
    }

}
