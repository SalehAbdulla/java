import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
public class FullTimeTutor extends Employee {
    private double annualSalary;

    public FullTimeTutor(int staffId, String name, String address, int phoneNumber, boolean isPhDHolder, boolean isMasterHolder, double annualSalary) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder);
        this.annualSalary = annualSalary;
    }
}
