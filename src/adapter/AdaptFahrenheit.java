package adapter;

public class AdaptFahrenheit extends Adapter {

    private Fahrenheit fahrenheit;

    public AdaptFahrenheit(Fahrenheit fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double getTemperatura() {
        return ((fahrenheit.getTemperature() - 32) * 5 / 9);
    }

    @Override
    public void setTemperatura(double temperatura) {
        fahrenheit.setTemperature(temperatura * 9 / 5 + 32);
    }

}
