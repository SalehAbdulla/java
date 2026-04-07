import lombok.NonNull;

public class SalariedTutor extends FullTimeTutor {

    public SalariedTutor(long staffId, String name, String address, int phoneNumber, boolean isPhDHolder, boolean isMasterHolder, double annualSalary) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder, annualSalary);
    }

    @Override
    public double calcMonthlySalary() {
        double base = getAnnualSalary() / 12;
        return base + (base * getExtraSalary());
    }
}
