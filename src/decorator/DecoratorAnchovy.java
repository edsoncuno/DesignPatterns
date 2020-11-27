package decorator;

public class DecoratorAnchovy extends Decorator {

    public DecoratorAnchovy(Component component) {
        super.component = component;
    }

    @Override
    public double price() {
        return component.price() + 6;
    }

}
