package chainOfResponsability;

public class Handler1000 extends Handler {

    public Handler1000(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (0 <= amount && amount < 1000) {
            return amount * 0.01;
        } else {
            if (_nextHandler == null) {
                return -1;
            } else {
                return _nextHandler.handlerRequest(amount);
            }
        }
    }

}
