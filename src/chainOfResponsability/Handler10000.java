package chainOfResponsability;

public class Handler10000 extends Handler {

    public Handler10000(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (amount < 10000) {
            return amount * 0.02;
        } else {
            if (_nextHandler == null) {
                return -1;
            } else {
                return _nextHandler.handlerRequest(amount);
            }
        }
    }

}
