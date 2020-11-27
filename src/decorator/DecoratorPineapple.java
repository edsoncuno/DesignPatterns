package decorator;

public class DecoratorPineapple extends Decorator {

    public DecoratorPineapple(Component component) {
        super.component = component;
    }

    @Override
    public double price() {
        return component.price() + 2;
    }

}
