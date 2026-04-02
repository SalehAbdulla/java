import lombok.NonNull;

public class Admin extends FullTimeTutor {
    private final double adminBounce = 0.2;

    public Admin(@NonNull int staffId, @NonNull String address, @NonNull int phoneNumber, @NonNull boolean isPhDHolder, @NonNull boolean isMasterHolder) {
        super(staffId, address, phoneNumber, isPhDHolder, isMasterHolder);
    }
}
