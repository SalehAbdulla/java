public class Admin extends FullTimeTutor {
    private final double ADMIN_BOUNCE = 0.02;
    private boolean hasAdditionalDuty;

    public Admin(long staffId, String name, String address, int phoneNumber,
                 boolean isPhDHolder, boolean isMasterHolder,
                 double annualSalary, boolean hasAdditionalDuty) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder, annualSalary);
        this.hasAdditionalDuty = hasAdditionalDuty;
    }

    public double calcMonthlySalary() {
        double base = getAnnualSalary() / 12;
        if (hasAdditionalDuty) {
            return base + (base * ADMIN_BOUNCE);
        }
        return base;
    }
}