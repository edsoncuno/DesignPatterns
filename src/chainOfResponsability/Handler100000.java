package chainOfResponsability;

public class Handler100000 extends Handler {

    public Handler100000(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (amount < 100000) {
            return amount * 0.03;
        } else {
            if (_nextHandler == null) {
                return -1;
            } else {
                return _nextHandler.handlerRequest(amount);
            }
        }
    }

}
