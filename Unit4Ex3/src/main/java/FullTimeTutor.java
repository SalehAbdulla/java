import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

public class FullTimeTutor extends Employee {
    private double annualSalary;

    public FullTimeTutor(@NonNull int staffId, @NonNull String address, @NonNull int phoneNumber, @NonNull boolean isPhDHolder, @NonNull boolean isMasterHolder) {
        super(staffId, address, phoneNumber, isPhDHolder, isMasterHolder);

    }
}
