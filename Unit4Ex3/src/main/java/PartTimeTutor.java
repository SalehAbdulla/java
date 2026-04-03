import lombok.Data;

import java.util.ArrayList;

@Data
public class PartTimeTutor extends Employee {
    private double monthlySalary;
    private double hourlyRate;
    private ArrayList<PartTimeRecord> numberOfHoursList = new ArrayList<>();

    public PartTimeTutor(int staffId, String name, String address, int phoneNumber, boolean isPhDHolder, boolean isMasterHolder, double monthlySalary, double hourlyRate, ArrayList<PartTimeRecord> numberOfHoursList) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder);
        this.monthlySalary = monthlySalary;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursList = numberOfHoursList;
    }
}
