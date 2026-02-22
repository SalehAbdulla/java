public class RainFallCalculator {
    private int[] rainFullYearlyData;

    public RainFallCalculator(int[] rainFullYearlyData) {
        this.rainFullYearlyData = rainFullYearlyData;
    }

    public double getAverage(){
        int sum = 0;
        for (int r : rainFullYearlyData) {
            sum += r;
        }
        return (double) sum / rainFullYearlyData.length;
    }

    // Overloaded method to get the average
    public double getAverage(int[] nums){
        int sum = 0;
        for (int r : nums) {
            sum += r;
        }
        return (double) sum / rainFullYearlyData.length;
    }

}
