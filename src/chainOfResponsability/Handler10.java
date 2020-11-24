package chainOfResponsability;

public class Handler10 extends Handler {

    public Handler10(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (amount < 10) {
            double result = amount * 0.01;
            return result;
        } else {
            if (_nextHandler == null) {
                return -1;
            } else {
                return _nextHandler.handlerRequest(amount);
            }
        }
    }

}
