package chainOfResponsability;

public abstract class Handler {
    
    protected Handler _nextHandler;

    public Handler(Handler x) {
        _nextHandler = x;
    }

    public void nextHandler(Handler x) {
        _nextHandler.nextHandler(x);
    }

    public abstract double handlerRequest(double amount);
}
