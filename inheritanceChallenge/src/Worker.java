public class Worker {
    private final String name;
    private final String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Integer.parseInt(birthDate) - Integer.parseInt(endDate);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
