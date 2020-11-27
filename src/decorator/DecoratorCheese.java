package decorator;

public class DecoratorCheese extends Decorator {

    public DecoratorCheese(Component component) {
        super.component = component;
    }

    @Override
    public double price() {
        return component.price() + 5;
    }

}
