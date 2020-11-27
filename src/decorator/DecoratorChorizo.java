package decorator;

public class DecoratorChorizo extends Decorator {

    public DecoratorChorizo(Component component) {
        super.component = component;
    }

    @Override
    public double price() {
        return component.price() + 3.5;
    }

}
