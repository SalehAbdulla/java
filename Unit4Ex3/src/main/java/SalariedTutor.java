import lombok.NonNull;

public class SalariedTutor extends FullTimeTutor {

    public SalariedTutor(@NonNull int staffId, @NonNull String address, @NonNull int phoneNumber, @NonNull boolean isPhDHolder, @NonNull boolean isMasterHolder) {
        super(staffId, address, phoneNumber, isPhDHolder, isMasterHolder);
    }
}
