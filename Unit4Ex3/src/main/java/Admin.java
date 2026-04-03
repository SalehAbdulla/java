import lombok.NonNull;

public class Admin extends FullTimeTutor {
    private final double ADMIN_BOUNCE = 0.2;

    public Admin(int staffId, String name, String address, int phoneNumber, boolean isPhDHolder, boolean isMasterHolder, double annualSalary) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder, annualSalary);
    }
}
