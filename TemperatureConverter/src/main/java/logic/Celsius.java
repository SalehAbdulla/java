package logic;

public class Celsius {
    private double tempInCelsius;

    public Celsius(double tempInCelsius) {
        this.tempInCelsius = tempInCelsius;
    }

    public double getTempInFahrenheit(){
        return (tempInCelsius * 1.8) + 32;
    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public void setTempInCelsius(double tempInCelsius) {
        this.tempInCelsius = tempInCelsius;
    }
}
