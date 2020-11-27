package decorator;

public class DecoratorJalapeno extends Decorator {

    public DecoratorJalapeno(Component component) {
        super.component = component;
    }

    @Override
    public double price() {
        return component.price() + 4;
    }

}
