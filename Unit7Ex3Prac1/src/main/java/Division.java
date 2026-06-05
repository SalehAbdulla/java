public class Division {
    private double num1;
    private double num2;

    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("denominator cannot be zero");
        }

        return num1 / num2;
    }
}
