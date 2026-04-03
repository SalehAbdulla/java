import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {
    @NonNull
    private int staffId;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    private int phoneNumber;
    @NonNull
    private boolean isPhDHolder;
    @NonNull
    private boolean isMasterHolder;
    private double extraSalary = 0;

    public Employee(int staffId, String name ,String address, int phoneNumber,
                    boolean isPhDHolder, boolean isMasterHolder) {
        this.staffId = staffId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isPhDHolder = isPhDHolder;
        this.isMasterHolder = isMasterHolder;
        calcExtraSalary();
    }

    private void calcExtraSalary(){
        if (isPhDHolder && isMasterHolder) {
            setExtraSalary(0.10);
        } else if (isPhDHolder){
            setExtraSalary(0.10);
        } else if (isMasterHolder){
            setExtraSalary(0.05);
        } else {
            setExtraSalary(0);
        }
    }

}
