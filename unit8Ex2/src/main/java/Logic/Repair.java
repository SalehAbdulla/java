package Logic;

public class Repair {
    private static int nextId = 1;
    private int repairId;
    private String problemDescription;
    private String make;
    private String model;
    private String customerName;
    private String customerPhone;

    public Repair(String problemDescription, String make, String model,
                  String customerName, String customerPhone) {
        this.repairId = nextId++;
        this.problemDescription = problemDescription;
        this.make = make;
        this.model = model;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    // Getters
    public int getRepairId() { return repairId; }
    public String getProblemDescription() { return problemDescription; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getCustomerName() { return customerName; }
    public String getCustomerPhone() { return customerPhone; }

    // Setters
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Repair ID: " + repairId +
                "\nProblem: " + problemDescription +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nCustomer: " + customerName +
                "\nPhone: " + customerPhone;
    }
}