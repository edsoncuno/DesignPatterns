package chainOfResponsability;

public class Handler1000000 extends Handler {

    public Handler1000000(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (100000 <= amount) {
            return amount * 0.04;
        } else {
            if (_nextHandler == null) {
                return -1;
            } else {
                return _nextHandler.handlerRequest(amount);
            }
        }
    }

}
