package chainOfResponsability;

public class Handler1000 extends Handler{

    public Handler1000(Handler x) {
        super(x);
    }

    @Override
    public double handlerRequest(double amount) {
        if (amount < 1000) {
            double result = amount * 0.03;
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
