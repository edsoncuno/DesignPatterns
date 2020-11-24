package chainOfResponsability;

public class Handler100 extends Handler{

    public Handler100(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (amount < 100) {
            double result = amount * 0.02;
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
