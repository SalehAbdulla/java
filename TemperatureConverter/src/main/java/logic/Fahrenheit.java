package logic;

public class Fahrenheit {
    private double tempInFahrenheit;

    public Fahrenheit(double tempInFahrenheit) {
        this.tempInFahrenheit = tempInFahrenheit;
    }

    public double getTempInCelsius() {
        return ((tempInFahrenheit - 32) * 5 ) / 9;
    }


    public double getTempInFahrenheit() {
        return tempInFahrenheit;
    }

    public void setTempInFahrenheit(double tempInFahrenheit) {
        this.tempInFahrenheit = tempInFahrenheit;
    }


}
